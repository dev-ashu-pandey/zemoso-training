import { Typography } from "@mui/material"
import FilterListIcon from '@mui/icons-material/FilterList';
import MoreVertIcon from '@mui/icons-material/MoreVert';
import IconButton from "@mui/material/IconButton";
import './index.css'
import {Stack} from '@mui/material'
import { Input } from "../../Atom/Input";
type InputProps={
    handleChange:(e:React.ChangeEvent<HTMLInputElement>)=>void
}
export const CandidateHeading=(props:InputProps)=>{
    return(
        <div className="mainHeading">
            <Typography variant="h5" component='div'>Candidate Information</Typography>           
            <Stack direction='row' spacing={2}>
                {/* <Input type="text" placeholder={`${ <SearchIcon/> } Search any Candidate`}/> */}
                <Input type="text" placeholder="Search for candidates ..."  handleChange={props.handleChange} />
                <IconButton size="small"><FilterListIcon/>Filter</IconButton>
                <button><MoreVertIcon/></button>

            </Stack>
            
        </div>

    )
}