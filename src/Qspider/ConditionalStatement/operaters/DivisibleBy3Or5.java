package Qspider.ConditionalStatement.operaters;

public class DivisibleBy3Or5 {
    public static void main(String[] args) {
        int n=9;
        if (n%3==0 || n%5==0){
            System.out.println("Number divisible by 3 and 5");
        }
        else{
            System.out.println("Not divisible by 3 and 5");
        }
    }
}
