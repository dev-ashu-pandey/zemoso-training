import './NavIcon.css'
import image from './IconImage/accounticon.png'
type NavIconProps={
    src:string,
    altval:string,
    size:'smallsq'|'mediumsq'|'largesq'
}
export const NavIcon=(props:NavIconProps)=>{
    const {size,src=image,altval='Image not available'}=props
    return <img className={`Avtar ${size}`} src={src} alt={altval} />
}