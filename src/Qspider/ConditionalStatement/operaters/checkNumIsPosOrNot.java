package Qspider.ConditionalStatement.operaters;

public class checkNumIsPosOrNot {
    public static void main(String[] args) {
        int num=-9;
        if (!(num<0)){
            System.out.println("Number is positive");
        }else {
            System.out.println("Number is negative");
        }
    }
}
