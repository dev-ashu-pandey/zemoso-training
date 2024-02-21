import "./Avtar.css"
import image from './Avtar_image/avtar4.png'
type AvtarProps={
    src?:string,
    size:string,
    altval?:string
}
export const Avtar=(props:AvtarProps)=>{
    const {size,src=image,altval='Image not available'}=props
    return <img className={`Avtar ${size}`} src={src} alt={altval} />
}