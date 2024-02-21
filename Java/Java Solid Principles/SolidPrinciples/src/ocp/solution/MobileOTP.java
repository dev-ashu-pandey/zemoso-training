package ocp.solution;

public class MobileOTP implements OTPService {
    public void sendOTP(String medium) {
        //write logic to integrate with mobile api
        System.out.println("OTP is send through"+medium);
    }
}
