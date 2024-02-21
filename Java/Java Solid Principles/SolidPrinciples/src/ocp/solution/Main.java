package ocp.solution;

public class Main {
    public static void main(String[] args) {
        WhatsAppOTP whatsAppOTP=new WhatsAppOTP();
        whatsAppOTP.sendOTP("123456789");
        MobileOTP mob=new MobileOTP();
        mob.sendOTP("123456789");
        EmailOTP email=new EmailOTP();
        email.sendOTP("123456789");
    }
}
