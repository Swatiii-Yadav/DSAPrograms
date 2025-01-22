package january22;

import java.util.Scanner;

public class PrintBoundaryElementInMatrix {

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Insert row value");
            int row=sc.nextInt();
            System.out.println("Insert col value");
            int col=sc.nextInt();
            int[][] matrix=new int[row][col];
            System.out.println("Insert  value into matrix");
            for (int i=0;i<row;i++){
                for (int j=0;j<col;j++){
                    matrix[i][j]=sc.nextInt();
                }
            }

            //print output
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[0][j] + " ");
            }


            for (int i = 1; i < row - 1; i++) {
                System.out.print(matrix[i][col - 1] + " ");
            }


            if (row > 1) {
                for (int j = col - 1; j >= 0; j--) {
                    System.out.print(matrix[row - 1][j] + " ");
                }
            }


            if (col > 1) {
                for (int i = row - 2; i > 0; i--) {
                    System.out.print(matrix[i][0] + " ");
                }
            }
        }


}
