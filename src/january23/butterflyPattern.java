package january23;

import java.util.Scanner;

public class butterflyPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //upper part

        for (int i=0;i<n;i++){
            for (int j=0;j<=i;j++){
                System.out.print("*");
            }
            for (int j=0;j<2*(n-i-1);j++){
                System.out.print(" ");
            }
            for (int k=0;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();

        }
        //lower part
        for (int i=0;i<n;i++){

            for (int j=i;j<n;j++){
                System.out.print("*");
            }

            for (int j=0;j<2*i;j++){
                System.out.print(" ");
            }

            for (int k=i;k<n;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
