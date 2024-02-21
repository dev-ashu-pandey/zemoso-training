package srp.solution;

public class Account {
    private String accountId;
    private double balance;

    public Account(String accountId) {
        this.accountId = accountId;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount+" money has been credited in your A/c");
    }

    public void withdraw(double amount) {
        if (balance < amount) {
            throw new RuntimeException("Insufficient balance");
        }
        balance -= amount;
        System.out.println(amount+" money has been debited from your A/c");
    }

    public double getBalance() {
        return balance;
    }
}
