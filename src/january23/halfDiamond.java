package january23;

import java.util.Scanner;

public class halfDiamond {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("number of rows:");
        int row=sc.nextInt();
        System.out.println("number of column:");
        int col=sc.nextInt();
        for (int i=0;i<=row;i++){
            for (int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=0;i<=row;i++){
            for (int j=i;j<=row;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}