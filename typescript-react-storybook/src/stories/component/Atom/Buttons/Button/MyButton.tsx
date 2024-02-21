import './MyButton.css'
type ButtonProps={
    name:string
    variants?:string
    size:'medium'|'small'|'large'
}
export const MyButton=(props:ButtonProps)=>{
    const {name='button',variants='Primary',size='medium'}=props
    return(
        <div>
            <button className={`btn ${variants} ${size}`}  >{name}</button>
        </div>
    )
}