import { Avtar } from "./Avtar"
import image from './Avtar_image/avtar4.png'
import image1 from './Avtar_image/avtar1.jpeg'
import image2 from './Avtar_image/avtar2.png'
import image3 from './Avtar_image/avtar3.jpeg'
import { ComponentMeta, ComponentStory } from "@storybook/react"
export default{
    title:"Atom/My Avtar",
    argTypes:{
        src:{
            options:[image,image1,image2,image3],
            control:{type:'select'}
        },
        size:{
            options:['small','large'],
            control:{type:'radio'}
        }
    }
} as ComponentMeta<typeof Avtar>

const Template:ComponentStory<typeof Avtar>=(args)=><Avtar {...args} ></Avtar>

export const likesAvtar = Template.bind({});
likesAvtar.args={
    src:image,
    size:'small'
}
export const imageAvtar = Template.bind({});
imageAvtar.args={
    src:image1,
    size:'large'
}