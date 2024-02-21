import { ComponentMeta, ComponentStory } from "@storybook/react";
import { Input } from "./Input";

export default{
    title:"Atom/My Input"
} as ComponentMeta<typeof Input>

const Template:ComponentStory<typeof Input>=(args)=><Input {...args} ></Input>

export const textInput = Template.bind({});
textInput.args={
    type:'text',
    placeholder:'abc@gmail.com'
}
export const passwordInput = Template.bind({});
passwordInput.args={
    type:'password',
    placeholder:'********'
}
export const checkboxInput = Template.bind({});
checkboxInput.args={
    name:'Remember',
    type:'checkbox'
}
