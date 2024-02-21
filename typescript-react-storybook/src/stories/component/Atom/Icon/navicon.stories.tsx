import image from './IconImage/icon1.png'
import image4 from './IconImage/icon6.jpeg'
import image5 from './IconImage/icon8.png'
import image6 from './IconImage/icon9.jpg'
import image7 from './IconImage/icon7.jpg'
import home from './IconImage/homeicon.png'
import account from './IconImage/accounticon.png'
import download from './IconImage/downloadicon.png'
import { ComponentMeta, ComponentStory } from "@storybook/react"
import { NavIcon } from './NavIcon'

export default{
    title:"Atom/My Icon/nav",
    argTypes:{
        src:{
            options:[image,home,account,download,image4,image5,image6],
            control:{type:'select'}
        },
        size:{
            options:['smallsq','largesq'],
            control:{type:'radio'}
        }
    }
} as ComponentMeta<typeof NavIcon>

const Template:ComponentStory<typeof NavIcon>=(args)=><NavIcon {...args} ></NavIcon>


export const homeIcon = Template.bind({});
homeIcon.args={
    src:home,
    size:'largesq'
}
export const accountIcon = Template.bind({});
accountIcon.args={
    src:account,
    size:'largesq'
}
export const downloadIcon = Template.bind({});
downloadIcon.args={
    src:download,
    size:'largesq'
}
export const logo = Template.bind({});
logo.args={
    src:image7,
    size:'largesq'
}