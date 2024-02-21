package ocp.solution;
// Open Closed Principle: For the new requirement module should be open for extension but closed for modification
//
public class EmailOTP implements OTPService {
    public void sendOTP(String medium) {
        //write logic to integrate with email api
        System.out.println("OTP is send through"+medium);
    }
}
