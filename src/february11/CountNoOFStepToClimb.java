package february11;

import java.util.Scanner;

public class CountNoOFStepToClimb {
    public static int countNo(int n) {
        if (n == 0) {
            return 1;
        }

        if (n < 0) {
            return 0;
        }
        return countNo(n - 1) + countNo(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        System.out.println(" total ways: " +countNo(n));
    }
}
