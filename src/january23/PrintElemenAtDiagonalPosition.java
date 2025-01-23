package january23;

import java.util.Scanner;

public class PrintElemenAtDiagonalPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("n");
        int n = sc.nextInt();
        int[][] mat = new int[n][n];
        System.out.println("Insert value into matrix");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    System.out.print(mat[j][i] + " ");
                }
            }
            System.out.println();
        }
    }
}
