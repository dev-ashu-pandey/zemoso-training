import image from './IconImage/icon1.png'
type IconProps={
    src:string,
    altval:string,
    size:'small'|'medium'|'large'
}
export const Icon=(props:IconProps)=>{
    const {size,src=image,altval='Image not available'}=props
    return <img className={`Avtar ${size}`} src={src} alt={altval} />
}