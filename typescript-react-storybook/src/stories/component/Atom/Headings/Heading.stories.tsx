import { ComponentMeta, ComponentStory } from "@storybook/react"
import { Heading } from "./Heading"
export default {
    title:"Atom/My Headings",
    argTypes:{
        color:{
            options:['blue','purple','violet'],
            control:{type:'radio'}
        }
    }
} as ComponentMeta<typeof Heading>

const Template:ComponentStory<typeof Heading>=(args)=><Heading {...args} ></Heading>
// this will bind an empty object with named Components
export const smallHeading = Template.bind({});
smallHeading.args={
    text:'Sign In ',
    size:'small',
};
export const largeHeading = Template.bind({});
largeHeading.args={
    text:'Sign In ',
    size:'large',
};
export const sampleHeading1 = Template.bind({});
sampleHeading1.args={
    text:'Candidates',
    size:'large',
};
export const sampleHeading2 = Template.bind({});
sampleHeading2.args={
    text:'RECRUIT',
    size:'large',
    color:'blue'
};