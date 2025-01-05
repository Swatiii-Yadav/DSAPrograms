package Qspider.loops;

public class NumDivisibleBy3And7 {
    /*2 digits numbers only*/
    public static void main(String[] args) {
        for (int i = 10; i <=99 ; i++) {
            if (i%3==0 || i%7==0){
                System.out.print(i+"  ");
            }
        }
    }
}
