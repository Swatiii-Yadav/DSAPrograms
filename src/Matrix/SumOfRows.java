package Matrix;

import java.util.Scanner;

public class SumOfRows {
    static void findRowsSum(int[][]mat){
        int sum=0;

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {

            }
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                int row=3,col=2;
        int[][] mat = new int[row][col];
        System.out.println("Insert value into matrix");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i <row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
