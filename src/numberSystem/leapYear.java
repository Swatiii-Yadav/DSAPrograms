package numberSystem;

public class leapYear {

        public static void main(String[] args) {
            int year=2023;
            if (year%4==0 && year%100!=0){
                System.out.println("Leap year");
            }
            else if (year%400==0){
                System.out.println("Leap Year");
            }
            else{
                System.out.println("Not a leap year");
            }
        }

}
