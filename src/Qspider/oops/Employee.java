package Qspider.oops;

import java.util.Scanner;

/*Define a class employee with the following specification :
Members are : empno of type integer, ename of type String, basic, hr and da are of  type float, netpay of type float.
Member functions :
Calculate() : A function to find basix+hra+da with the float return type.
havedata() : function to accept values for empno, ename, basic, hra, da and invoke calculate() to calculate netpay.
dispdata() : function to display all the data members.
* */
public class Employee {
    int empNo;
    String name;
    float basic,hr,da,netpay;
     float Calculate(){
         return basic+hr+da;
    }
    void haveData(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter employee no: ");
         empNo= sc.nextInt();
        sc.nextInt();
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.println("Enter Basic, HRA and DA : ");
        basic=sc.nextFloat();
        hr=sc.nextFloat();
        da=sc.nextFloat();
        netpay=Calculate();
    }
    void displayData(){
        System.out.println("Employee Number : "+empNo);
        System.out.println("Employee Name "+name);
        System.out.println("Basic   : "+basic);
        System.out.println("HRA : "+hr);
        System.out.println("DA : "+da);
        System.out.println("Net Pay: "+netpay);
    }

    public static void main(String[] args) {
Employee e1=new Employee();

e1.haveData();
        e1.displayData();
e1.Calculate();
    }
}
