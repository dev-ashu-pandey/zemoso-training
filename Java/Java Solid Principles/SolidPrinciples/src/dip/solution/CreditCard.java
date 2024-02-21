package dip.solution;

public class CreditCard implements BankCard{

    public void doTransaction(long amount){
        System.out.println("payment using Credit card");
    }
    public void sendOTP(long mobNumber){
        System.out.println("OTP is send to "+mobNumber+" for Credit Card transaction");
    }
}
