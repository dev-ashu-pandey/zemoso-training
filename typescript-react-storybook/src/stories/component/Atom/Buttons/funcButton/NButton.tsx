import './NButton.css'
type NButtonProps={
    name:string,
    background?:"blueBackground",
    size:'medium'|'small'|'large',
    onClick?: () => void;
}
export const NButton=(props:NButtonProps)=>{
    const {name='button',background,size='medium',onClick}=props
    return(
        <div>
            <button onClick={onClick} className={`btns ${background} ${size}`} >{name}</button>
        </div>
    )
}