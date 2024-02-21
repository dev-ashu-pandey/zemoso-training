//this fortawesome provide different number of icon which we can use
import '@fortawesome/fontawesome-free/css/all.min.css'
import { Icon } from '../../Atom/Icon/Icon'
import './ButtonwithIcon.css'
type ButtonWithIconProps={
    src:string,
    text:string
}
export const ButtonWithIcon=(props:ButtonWithIconProps)=>{
    return <button className='button'>
                <span className='icon'>
                    <Icon  src={props.src} size='small' altval='not found'></Icon>
                </span>{props.text}
            </button>
}