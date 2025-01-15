package Qspider.oops;

import java.util.Scanner;

/*
*
 Create a class Bank with the following Menu :
Display all account details
Deposit the amount
Withdraw the amount
Exit
*/
public class BankAccount {
    String accNumber;
    double balance;
    void withdraw(double amt){
        balance=balance-amt;
        System.out.println("Available balance in account "+accNumber+ " is "+balance);
    }
    void deposit(double amt){
        balance=balance+amt;
        System.out.println("Available balance in account "+accNumber+ " is "+balance);
    }
    void AccDetails(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter account number: ");
        accNumber=sc.nextLine();
        System.out.println("Enter current balance: ");
        balance=sc.nextDouble();
    }
    public static void main(String[] args) {
       BankAccount acc=new BankAccount();
       acc.AccDetails();
       acc.deposit(567);
    }
}
