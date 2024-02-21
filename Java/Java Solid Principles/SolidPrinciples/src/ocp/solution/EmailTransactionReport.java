package ocp.solution;

public class EmailTransactionReport implements TransactionReport{
    @Override
    public void sendTransactionReport(String medium) {
        //write logic to integrate with email api
        System.out.println("Transaction report send through"+medium);
    }
}
