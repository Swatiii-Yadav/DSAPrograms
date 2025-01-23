package Patterns;

import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //1st part
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
