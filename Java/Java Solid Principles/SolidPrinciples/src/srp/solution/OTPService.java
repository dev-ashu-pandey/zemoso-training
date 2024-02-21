package srp.solution;

public class OTPService {
    public void sendOTP(String medium) {
        if (medium.equals("email")) {
            //write email related logic
            //use JavaMailSenderAPI
            System.out.println("OTP is send to "+medium);
        }
        if(medium.equals("mobile")){
            //write logic using twillio API
            System.out.println("OTP is send to "+medium);
        }
    }
}
