package Patterns;

public class hollowHourGlass {
    public static void main(String[] args) {
        int n=5;
        for (int i = n; i>=0; i--) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            if (i > 1) {
                for (int j = 1; j <= 2 * i - 3; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 2; i <=n; i++) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            if (i > 1) {
                for (int j = 1; j <= 2 * i - 3; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }



                }
            }


