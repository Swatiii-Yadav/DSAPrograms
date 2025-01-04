package Qspider.ConditionalStatement.operaters;

public class CalcPercentage {
    /*for the given marks below calc the total % and print the result as follows
    * % below 35 print fail
    * 35 and above to below 60 print 2nd class
    * 60 and above but below 80 print first class
    * above 80 print distinction class*/
    public static void main(String[] args) {
        int total =87;//in percentage
        if (total<35){
            System.out.println("fail");
        }
        else if (total>35 && total <60){
            System.out.println("second class");
        }
        else if (total>60 && total <80){
            System.out.println("First class");
        }

        else {
            System.out.println("Distinction class");
        }


    }
}
