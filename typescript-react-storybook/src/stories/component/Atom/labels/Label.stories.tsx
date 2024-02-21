import { Label } from "./Label";
import { ComponentMeta, ComponentStory } from "@storybook/react";
export default{
    title:'Atom/My Label'
} as ComponentMeta<typeof Label>

const Template:ComponentStory<typeof Label>=(args)=> <Label {...args} ></Label>

export const smallLabel = Template.bind({});
smallLabel.args={
    label:'email',
    text:'email',
    size:'small',
};
export const largeLabel = Template.bind({});
largeLabel.args={
    label:'email',
    text:'email',
    size:'large',
};
