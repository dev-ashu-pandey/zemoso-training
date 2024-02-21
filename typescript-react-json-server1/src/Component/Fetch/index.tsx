import {Box, Card, CardContent, Typography, Button, Input} from '@mui/material'
import axios from "axios"
import { useEffect, useState } from "react"
import './index.css'
import { Link } from 'react-router-dom'
// import { Header } from '../Header'

export const Fetch=()=>{
    const [myData,setMyData]=useState([]);
    // const [records,setRecords]=useState([])
    const fetchDataFromJSONserver=async (url:string)=>{
        try{
            const data = await axios.get(url);
            setMyData(data.data);
            console.log(data.data);
        }
        catch(error){
            console.log(error)
        }
    }
    useEffect(()=>{
        fetchDataFromJSONserver(`http://localhost:3000/users`);
    },[])
    async function handleDelete(id:string){
        const res=await axios.delete('http://localhost:3000/users/'+id)
        fetchDataFromJSONserver(`http://localhost:3000/users`);
        console.log(res)
    }
    return(
        <div>
            <div>
            <Input placeholder='Search'></Input>
            <Link to='/create'>Add+</Link>
        </div>
            <div>{myData.map(obj=>{
                const {id,name,email}=obj
                return(
                    <Box width='500px' margin='5px' key={id}>
                        <Card>
                            <CardContent>
                                <div className='table-container'>
                                    <Typography>{name}</Typography>
                                    <Typography>{email}</Typography>
                                    <div>
                                        <Link to={`/update/${id}`}>Update</Link>
                                        <Button onClick={(e)=>handleDelete(id)}>Delete</Button>
                                    </div>
                                </div>
                            </CardContent>
                        </Card>
                    </Box>
                )
            })}</div>
        </div>
    )
}