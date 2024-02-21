package dip.voilation;
// here shopping mall tightly coupled with Debit card
public class ShoppingMall {

    private DebitCard debitCard;
//    private CreditCard creditCard;

    public ShoppingMall(DebitCard debitCard) {
        this.debitCard = debitCard;
    }

    public void doPurchaseSomething(long amount){
        debitCard.doTransaction(amount);
    }

    public static void main(String[] args) {
         DebitCard myDebitCard=new DebitCard();
//         CreditCard myCreditCard=new CreditCard();

        ShoppingMall shoppingMall=new ShoppingMall(myDebitCard);
        shoppingMall.doPurchaseSomething(5000);
    }
}
