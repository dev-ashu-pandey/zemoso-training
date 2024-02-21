import './Heading.css'
type HeadingProps={
    text:string,
    size:string,
    color?:string
}
export const Heading=(props:HeadingProps)=>{
    const {text,size,color}=props
    return(
        <div>
            <h2 className={`head ${size} ${color}`} >{text}</h2>
        </div>
    )
}