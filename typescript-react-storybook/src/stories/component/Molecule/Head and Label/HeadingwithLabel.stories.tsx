import { ComponentMeta, ComponentStory } from "@storybook/react"
import { HeadingwithLabel } from "./HeadingwithLabel"
export default{
    title:'Molecule/Heading with Label',
} as ComponentMeta<typeof HeadingwithLabel>


const Template:ComponentStory<typeof HeadingwithLabel>=(args)=><HeadingwithLabel {...args}></HeadingwithLabel>

export const headandLabel = Template.bind({});
headandLabel.args={
    headText:'SignIn',
    headSize:'large',
    labelText:'Please enter your sign in credentials',
    labelSize:'small'
}