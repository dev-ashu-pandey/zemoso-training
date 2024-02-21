package srp.solution;


public class BankService {

    public static void main(String[] args) {
        Account ashutosh=new Account("23456789");
        ashutosh.deposit(18000);
        ashutosh.getBalance();
        OTPService mobile=new OTPService();
        mobile.sendOTP("mobile");
    }
}