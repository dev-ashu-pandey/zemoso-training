import { Label } from "../../Atom/Label"

type Props={
    labelText:string,
    linkText:string
}
export const LabelWithLink=(props:Props)=>{
    return(
        <div>
            <Label text={props.labelText} label={props.linkText} size="medium" />
            <a href="http">{props.linkText}</a>
        </div>
    )
}