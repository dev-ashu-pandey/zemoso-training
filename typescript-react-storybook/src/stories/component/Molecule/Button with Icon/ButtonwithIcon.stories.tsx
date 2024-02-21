import { ComponentMeta, ComponentStory } from "@storybook/react";
import git_image from '../../Atom/Icon/IconImage/githubicon.png'
import google_image from '../../Atom/Icon/IconImage/googleicon.jpg'
import { ButtonWithIcon } from "./ButtonwithIcon";
export default{
    title:'Molecule/Button with Icon',
    component:ButtonWithIcon
}as ComponentMeta<typeof ButtonWithIcon>

const Template:ComponentStory<typeof ButtonWithIcon>=(args)=><ButtonWithIcon {...args}></ButtonWithIcon>

export const githubButton = Template.bind({});
githubButton.args={
    src:git_image,
    text:'Sign in with Github'
}

export const googleButton = Template.bind({});
googleButton.args={
    src:google_image,
    text:'Sign in with Google'
}
