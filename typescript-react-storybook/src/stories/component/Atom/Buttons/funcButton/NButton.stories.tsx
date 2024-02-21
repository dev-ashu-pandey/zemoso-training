import { ComponentMeta, ComponentStory } from "@storybook/react";
// import { Component } from "react";
import { NButton } from "./NButton";
export default {
    title:'Atom/My Buttons/Function Button',
    argTypes:{
        // we can give default option so that user can understand that
        size:{
            options:['small','medium','large'],
            control:{type:'radio'}
        }
    }
} as ComponentMeta<typeof NButton>


const Template: ComponentStory<typeof NButton> = (args) => <NButton {...args}></NButton>;


// bind template with empty object
export const primaryButton = Template.bind({});
primaryButton.args={
    name:'Export'
};
// this is used for renaming story name     
// myPrimaryButton.storyName='I am Primary';

export const secondaryButton = Template.bind({});
secondaryButton.args={
    name:'Manual Order',
    background:"blueBackground"
};


