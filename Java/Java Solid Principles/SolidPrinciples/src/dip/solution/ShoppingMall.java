package dip.solution;

import java.util.Scanner;

public class ShoppingMall {

    private BankCard bankCard;
//    private DebitCard;

    public ShoppingMall(BankCard bankCard) {
        this.bankCard = bankCard;
    }

    public void doPurchaseSomething(long amount){
        bankCard.doTransaction(amount);
    }

    public static void main(String[] args) {
       // DebitCard debitCard=new DebitCard();
       // CreditCard creditCard=new CreditCard();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 for Debit card and 2 for Credit card");
        int n=sc.nextInt();
        BankCard bankCard;
        if(n==1) bankCard=new DebitCard();
        else bankCard=new CreditCard();
        ShoppingMall shoppingMall=new ShoppingMall(bankCard);
        shoppingMall.doPurchaseSomething(5000);
    }
}
