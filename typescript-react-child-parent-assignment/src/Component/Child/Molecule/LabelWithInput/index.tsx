import { Input } from "@mui/material"
import { Label } from "../../Atom/Label"
import './index.css'
type Props={
    text:string,
    placeholder?:string,
    name:string,
    type:string
}

export const LabelWithInput=(props:Props)=>{
    return(
        <div className="containerLabelInp">
            <Label text={props.text} label={props.name} size='medium' />
            <Input className="input" type={props.type} placeholder={props.placeholder} name={props.name} />
        </div>
    )
}