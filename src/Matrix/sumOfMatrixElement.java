package Matrix;

import java.util.Scanner;

public class sumOfMatrixElement {
    static void findSum(int[][]mat){
        int sum=0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                sum+=mat[i][j];
            }
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] mat = new int[2][2];
        System.out.println("Insert value into matrix");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
        findSum(mat);
    }
}
