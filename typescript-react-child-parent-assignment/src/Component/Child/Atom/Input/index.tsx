
type InputProps={
    type:string,
    placeholder?:string,
    name:string
}
export const Input=(props:InputProps)=>{
    const {type,placeholder,name='input'}=props
    return(
        <input  type={`${type}`} placeholder={`${placeholder}`} name={`${name}`} />
    )
}