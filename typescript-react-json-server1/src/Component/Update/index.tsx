import { Input } from "@mui/material"
import axios from "axios";
import { useEffect, useState } from "react";
import { useNavigate, useParams } from "react-router-dom"
export const Update=()=>{
    const {id} =useParams();
    const [data,setData]=useState({id,name:'',email:''})
    const fetchData=async ()=>{
        const res= await axios.get('http://localhost:3000/users/'+id)
        console.log(res.data)
        setData(res.data);
    }
    const navigate=useNavigate();
    useEffect(()=>{
        fetchData()
    },[])
    async function handleSubmit(e:React.FormEvent<HTMLFormElement>){
        e.preventDefault();
        const res=await axios.put('http://localhost:3000/users/'+id,data)
        navigate('/');
        console.log(res);
    }
    return(
        <div className="container">
            <form onSubmit={handleSubmit}>
                <div className="form">
                    <label htmlFor="id" className="label">Name:</label>
                    <Input name="id" disabled value={data.id} 
                    ></Input>
                    <label htmlFor="Name" className="label">Name:</label>
                    <Input name="Name" value={data.name} 
                    onChange={(e)=>{setData({...data,name:e.target.value})}}></Input>
                    <label htmlFor="email" className="label">Email</label>
                    <Input name="email" value={data.email} 
                    onChange={(e)=>{setData({...data,email:e.target.value})}}/>
                </div>
                <button className="btn">Update</button>
            </form>
        </div>
    )
}