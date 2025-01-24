package january24;

import java.util.Scanner;

public class sortElementRowByRow {

    static void sortMat(int[][] mat, int row, int col) {
        //sorting the matrix
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (mat[i][j] > mat[i][j+1]) {
                    int temp = mat[i][j];
                    mat[i][j] = mat[i][j + 1];
                    mat[i][j + 1] = temp;
                }
            }

        }
        //print tha sorted matrix
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();

        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Row:");
        int row = sc.nextInt();
        System.out.println("col:");
        int col = sc.nextInt();
        int[][] mat = new int[row][col];
        System.out.println("Insert value into matrix");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        sortMat(mat, row, col);
    }
}
