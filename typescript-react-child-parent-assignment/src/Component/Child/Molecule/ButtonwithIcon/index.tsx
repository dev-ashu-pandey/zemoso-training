import { Icon } from '../../Atom/Icon'
import './index.css'
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