package Matrix;

import java.util.Scanner;

public class searchNumberInMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Row:");
        int row=sc.nextInt();
        System.out.println("col:");
        int col=sc.nextInt();
        int[][] mat = new int[row][col];
        System.out.println("Insert value into matrix");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter element:");
        int x=sc.nextInt();
        //print indices of x element
        for (int i = 0; i <row; i++) {
            for (int j = 0; j <col; j++) {
                if (mat[i][j] == x) {
                    System.out.println(x+" present at "+i+" row and "+j+" column");
                }

            }
        }
    }
}
