package srp.solution;
// Single Responsibility Principle:- Every Java class must perform a single functionality
// Open Closed Principle: For the new requirement module should be open for extension but closed for modification
//
public class LoanService {

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
}
