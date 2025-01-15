package Qspider.oops;

/* Define a class Resort with the following description:
Members are : RNo to store Room Number, Name store customer name, Charges to store per day charges, Days to store number of days of stay.
Member functions :
Compute() to calculate and return Amount as Days * Charges and if the values of Days*Charges is more than 11000 then as 1.02*Days*Charges
Getinfo() A function to enter the content Rno, Name, Charges and Days.
DispInfo() A function to enter the content Rno, Name, Charges, Days and Amount by calling function Compute().
*/

import java.util.Scanner;

public class Resort {
    int roomNo;
    String name;
    int days;
    double charges;

    double compute(){
     double amount=days*charges;
     if (amount>=11000){
         amount=1.02*amount;
         return amount;
     }
     return amount;

    }

     void GetInfo(){
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter Room no: ");
         roomNo = sc.nextInt();
         sc.nextLine();
         System.out.print("Enter Name: ");
         name = sc.nextLine();
         System.out.print("Enter Charges per Day: ");
         charges = sc.nextDouble();
         System.out.print("Enter Number of Days: ");
         days = sc.nextInt();

     }
    void DisplayInfo(){
        System.out.println("Room no:"+roomNo);
        System.out.println("Name: "+name);
        System.out.println("days: "+days);
        System.out.println("charges "+compute());


    }

    public static void main(String[] args) {
Resort res=new Resort();
res.GetInfo();
res.DisplayInfo();
    }
}
