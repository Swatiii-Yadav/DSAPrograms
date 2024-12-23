package NumberSystem;

import java.util.Scanner;

public class primeFactorOFNum {
  static void primeFactor(int num){
        while(num%2==0){
            System.out.print(2+" ");
            num=num/2;
        }
        for (int i = 3; i < Math.sqrt(num); i++) {
            while (num % i == 0) {
                System.out.print(i + " ");
                num = num / i;
            }
        }
        if (num>2){
            System.out.println(num);
        }

  }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
      primeFactor(num);

    }
}
