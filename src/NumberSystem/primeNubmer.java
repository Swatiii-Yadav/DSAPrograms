package NumberSystem;

import java.util.Scanner;

public class primeNubmer {
    static boolean isPrime(int num) {
        if (num <= 0) {
            return false;
        }
        for (int i = 2; i <Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(isPrime(num));

    }
}
