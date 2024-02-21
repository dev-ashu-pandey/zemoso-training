
import './App.css';
import { MUICard } from './Component/Parent';
import { HeadingwithLabel } from './Component/Child/Molecule/Typography';
import { LabelWithInput } from './Component/Child/Molecule/LabelWithInput';
import { ButtonWithIcon } from './Component/Child/Molecule/ButtonwithIcon';
import { Input } from './Component/Child/Atom/Input';
import { Label } from './Component/Child/Atom/Label';
import { LabelWithLink } from './Component/Child/Molecule/LabelWithLink';
import { MyButton } from './Component/Child/Atom/Button';
import githubImage from './Icon_image/githubicon.png'
import googleImage from './Icon_image/googleicon.jpg'
function App() {
  return (
    <div className="App">
      {/* Parent */}
      <MUICard>
        {/* Childs */}
          <HeadingwithLabel headText="Sign In" headSize="large" labelText="Please enter your credential" labelSize="medium"/>
          <LabelWithInput text="Email" name="email" placeholder="abcdefgh@gmail.com" type="text" />
          <LabelWithInput text="Password" name="password" placeholder="**********" type="password" />
          <div className="inputLabelLink">
              <div className="inputLabel">
                  <Input type="checkbox" name="remember" />
                  <Label label="remember" text="Remember Me" size="medium" />
              </div>
              <a style={{marginRight:'2rem'}} href="http://">Forget Password</a>
          </div>
              <MyButton name="Sign in" variants="primary" size="medium"/>
          <div>___________________________or_____________________________</div>
          <div className="buttonContainer">
              <ButtonWithIcon  src={googleImage} text="Sign in with Google"/>
              <ButtonWithIcon src={githubImage} text="Sign in with Github"/>
              <LabelWithLink labelText="Don't have an account?" linkText="Sign up"/>
          </div>
      </MUICard>
    </div>
  );
}

export default App;
