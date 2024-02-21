package dip.solution;

public class DebitCard implements BankCard{

    public void doTransaction(long amount){
        System.out.println("payment using Debit card");
    }
    public void sendOTP(long mobNumber){
        System.out.println("OTP is send to "+mobNumber+" for Debit Card transaction");
    }
}
