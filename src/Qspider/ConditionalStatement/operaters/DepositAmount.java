package Qspider.ConditionalStatement.operaters;

public class DepositAmount {
    public static void main(String[] args) {
        /*For any deposit 50k and above pancard is must.below it  pancard is
        optional*/
        int balance=75000;
        int amount=25000;;
        boolean panCard=false;
        if (amount<50000 || panCard==true){
            balance+=amount;
            System.out.println("Amount deposit = "+amount);
            System.out.println("Balance available = "+balance);
        }
        else {
            System.out.println("Link pancard");
        }


    }
}
