package Qspider.ConditionalStatement;

public class AmountWIthdraw {
    public static void main(String[] args) {
        //total amount of balance in users account
        int balance=40000;
        //total amount of money user want to  deduct from account
        int amount=15000;
        //total balance after amount deduction
        if (amount<=balance) {
            balance = balance - amount;
        }
        System.out.println("Current balance:- "+balance);
    }
}
