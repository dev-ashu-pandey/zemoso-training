package dip.solution;
// Dependency Inversion Principle: We must use abstraction instead of concrete implementations.
// High level module should not depend on the low level module but both should depend on the abstraction
public interface BankCard {

    public void doTransaction(long amount);
    public void sendOTP(long mobNumber);
}
