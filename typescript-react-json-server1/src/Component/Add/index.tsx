import { Input } from "@mui/material"
import './index.css'
import { useState } from "react"
import axios from "axios";
import { useNavigate } from "react-router-dom";
export const Add=()=>{
    const [inputData,setInputData]=useState({name:'',email:''});
    const navigate=useNavigate();
    async function handleSubmit(e:React.FormEvent<HTMLFormElement>){
        e.preventDefault();
        try{
            const res=await axios.post('http://localhost:3000/users',inputData)
            console.log(res);
            navigate('/')
        }catch(e){
            console.log(e)
        }
    }
    return(
        <div className="container">
            <form onSubmit={handleSubmit}>
                <div className="form">
                    <label htmlFor="Name" className="label">Name:</label>
                    <Input name="Name" placeholder="Enter Name" 
                    onChange={(e)=>{setInputData({...inputData,name:e.target.value})}}></Input>
                    <label htmlFor="email" className="label">Email</label>
                    <Input name="email" placeholder="Enter email" 
                    onChange={(e)=>{setInputData({...inputData,email:e.target.value})}}/>
                </div>
                <button className="btn">Submit</button>
            </form>
        </div>
    )
}