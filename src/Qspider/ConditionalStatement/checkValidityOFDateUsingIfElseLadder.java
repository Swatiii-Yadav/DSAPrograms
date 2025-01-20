package Qspider.ConditionalStatement;

public class checkValidityOFDateUsingIfElseLadder {
    public static void main(String[] args) {
        int date=29;
        int month=2;
        int year=2024;
        if (date<0 ||date>31 ||month <0 ||month>12 || year<0){
            System.out.println("Invalid date");
        }
        else if((month==4 || month==6 || month ==9 ||month==11)&& date>30){
            System.out.println("Invalid date");
        }
        else if(!(year%4==0 && year%100!=0 ||year%400==0)&& month==2 && date>28 ){
            System.out.println("Invalid date");
        }
        else if((year%4==0 && year%100!=0 ||year%400==0)&& month==2 && date>29){
            System.out.println("Invalid date");
        }
    else {
            System.out.println("Valid Date");
        }
    }
}
