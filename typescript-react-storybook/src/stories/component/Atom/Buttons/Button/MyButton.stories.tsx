import { ComponentMeta, ComponentStory } from "@storybook/react";
import { MyButton } from "./MyButton";
export default {
    title:'Atom/My Buttons/nor',
    argTypes:{
        // we can give default option so that user can understand that
        size:{
            options:['small','medium','large'],
            control:{type:'radio'},
        },
        
    }
} as ComponentMeta<typeof MyButton>


const Template: ComponentStory<typeof MyButton> = (args) => <MyButton {...args}></MyButton>;


// bind template with empty object
export const myPrimaryButton = Template.bind({});
myPrimaryButton.args={
    name:'Sign In',
    variants:'primary'
};
// this is used for renaming story name     
// myPrimaryButton.storyName='I am Primary';

export const mySecondaryButton = Template.bind({});
mySecondaryButton.args={
    name:'Sign In with Google',
    variants:'secondary'
};


