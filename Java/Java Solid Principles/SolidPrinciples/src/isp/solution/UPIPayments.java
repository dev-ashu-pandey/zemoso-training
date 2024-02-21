package isp.solution;
// Interface Segregation Principle: larger interface split into the smaller one we cannot force
// our client to use a particular interface
public interface UPIPayments {

    public void payMoney();

    public void getScratchCard();

//    public void getCashBackAsCreditBalance();

}
