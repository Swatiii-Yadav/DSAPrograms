package Qspider.ConditionalStatement.operaters;

public class NumberOfDaysInMonth {
    public static void main(String[] args) {
        int month=5;
        if (month>12 || month<0){
            System.out.println("invalid input");
        }
        if (month==2 ){
            System.out.println("28/29 days ");
        }
        if (month==1  || month==3  || month==5  || month==7  || month==8
                || month==10 || month==12){
            System.out.println("31 days");
        } if (month==4 || month==6 ||month==9 ||month==11){
            System.out.println("30 days");
        }

    }
}
