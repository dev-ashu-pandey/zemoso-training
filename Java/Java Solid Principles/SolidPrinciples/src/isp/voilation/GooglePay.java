package isp.voilation;

public class GooglePay implements UPIPayments{

    @Override
    public void payMoney() {
        System.out.println("Money is payed by Google pay");
    }

    @Override
    public void getScratchCard() {

    }

    @Override
    public void getCashBackAsCreditBalance() {

    }
}
