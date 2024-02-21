import { Heading } from "../../Atom/Headings/Heading"
import { Label } from "../../Atom/labels/Label"
type HeadingwithLabelProps={
    headText: string,
    headSize:'large'|'medium'|'small',
    label?:string,
    labelText:string,
    labelSize:'large'|'medium'|'small',
}
export const HeadingwithLabel=({headText,headSize,label,labelText,labelSize}:HeadingwithLabelProps)=> {
    return(
        <div className="container">
            <Heading text={headText} size={headSize} ></Heading>
            <Label text={labelText} label={label} size={labelSize} ></Label>
        </div>
    )
}