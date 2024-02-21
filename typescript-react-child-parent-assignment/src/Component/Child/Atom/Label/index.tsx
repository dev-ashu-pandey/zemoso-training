type LabelProps={
    text:string,
    size:string,
    label?:string
}
export const Label=(props:LabelProps)=>{
    const {text,size,label}=props
    return(
        <label htmlFor={`${label}`} className={`label ${size}`}>{text}</label>
    )
}