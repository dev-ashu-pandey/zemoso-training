package srp.voilation;
// This class have too many task and responsibility to perform
//but SRP-> states that each class have single responsibility
public class BankService {
    public long deposit(long amount, String accountNo) {
        //deposit amount
        System.out.println(amount+" money has been credited in your A/c"+accountNo);
        return 0;
    }

    public long withDraw(long amount, String accountNo) {
        //withdraw amount
        System.out.println(amount+" money has been debited from your A/c"+accountNo);
        return 0;
    }
    public void getLoanInterestInfo(String loanType) {
        if (loanType.equals("homeLoan")) {
            System.out.println("You have applied for home loan");
            //do some job
        }
        if (loanType.equals("personalLoan")) {
            //do some job
            System.out.println("You have applied for Personal loan");

        }
        if (loanType.equals("car")) {
            //do some job
            System.out.println("You have applied for Car loan");
        }
    }

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

    public void printPassbook() {
        //update transaction info in passbook
        System.out.println("Printing passbook is processed");
    }
}
