package january26;

import java.util.Scanner;


public class MagicNumberSquare {
    public static boolean isMagic(int[][] matrix, int n) {
        //check magic square matrix

        int dia1 = 0, dia2 = 0;
        for (int i = 0; i < n; i++) {
            dia1 += matrix[i][i];
            dia2 += matrix[i][n - i - 1];
        }
        if (dia1 != dia2) {
            return false;
        }


        for (int i = 0; i < n; i++) {
            int rowSum = 0;
            int colSum = 0;
            for (int j = 0; j < n; j++) {
                rowSum += matrix[i][j];
                colSum += matrix[j][i];
            }
            System.out.println("sum of rows  "+rowSum);
            System.out.println("sum of  column "+colSum);
            if (rowSum != colSum || colSum != dia1)
                return false;
        }
        System.out.println("sum of 1 diagonal "+dia1);
        System.out.println("sum of 2 diagonal "+dia2);


        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("size of square:");
        int n = sc.nextInt();
        System.out.println("Insert element into matrix:");
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        if (isMagic(matrix, n)) {
            System.out.println("Magic Square");
        }
        else {
            System.out.println(" Not a Magic Square");
        }
    }

}

