package Qspider.ConditionalStatement.operaters;

public class weekDayOrWeekEnd {
    public static void main(String[] args) {
        int day=5;
        if (day>7 || day<0){
            System.out.println("invalid input");
        }
        if (day==1 || day==7){
            System.out.println("weekEnd");
        }
        if (day==2  || day==3 || day==4 || day==5 ||day==6){
            System.out.println("weekday");
        }

    }
}
