package Qspider.ConditionalStatement.operaters;

public class checkEligibility {
    //check eligibility ,if a person is eligible for premium credit card or not
    //if age is greater thaan 18 and income is greater than 50k
    public static void main(String[] args) {
        int age=20;
        int income=55000;
        if (age>18 && income>50000){
            System.out.println("Eligible for premium credit card");
        }
        else {
            System.out.println(" Not Eligible for premium credit card");
        }
    }
}
