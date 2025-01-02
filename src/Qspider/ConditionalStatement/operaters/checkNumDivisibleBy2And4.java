package Qspider.ConditionalStatement.operaters;

public class checkNumDivisibleBy2And4 {
    public static void main(String[] args) {
        int num=16;
        if(num%2==0 && num%4==0){
            System.out.println("Divisible by 2 and 4");
        }
        else{
            System.out.println("Not Divisible by 2 and 4");
        }
    }
}
