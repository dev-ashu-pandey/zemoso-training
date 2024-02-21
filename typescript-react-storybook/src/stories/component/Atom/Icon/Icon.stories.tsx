import image from './IconImage/icon1.png'
import image1 from './IconImage/icon3.png'
import image2 from './IconImage/icon4.png'
import image3 from './IconImage/icon5.png'
import image4 from './IconImage/icon6.jpeg'
import image5 from './IconImage/icon8.png'
import image6 from './IconImage/icon9.jpg'
import image7 from './IconImage/icon7.jpg'
import image8 from './IconImage/googleicon.jpg'
import image9 from './IconImage/githubicon.png'
import { ComponentMeta, ComponentStory } from "@storybook/react"
import { Icon } from "./Icon"
export default{
    title:"Atom/My Icon/normal",
    argTypes:{
        src:{
            options:[image,image1,image2,image3,image4,image5,image6],
            control:{type:'select'}
        },
        size:{
            options:['small','large'],
            control:{type:'radio'}
        }
    }
} as ComponentMeta<typeof Icon>

const Template:ComponentStory<typeof Icon>=(args)=><Icon {...args} ></Icon>

export const googleIcon = Template.bind({});
googleIcon.args={
    src:image8,
    size:'small'
}
export const githubIcon = Template.bind({});
githubIcon.args={
    src:image9,
    size:'small'
}

export const logo = Template.bind({});
logo.args={
    src:image7,
    size:'large'
}