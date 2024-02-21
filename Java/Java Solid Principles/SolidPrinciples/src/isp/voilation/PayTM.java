package isp.voilation;

public class PayTM implements UPIPayments{

    @Override
    public void payMoney() {

    }

    @Override
    public void getScratchCard() {

    }

    @Override
    public void getCashBackAsCreditBalance() {
//this feature is not applicable for PayTm but here the client is force for use this method
//        here ISP fails
    }
}
