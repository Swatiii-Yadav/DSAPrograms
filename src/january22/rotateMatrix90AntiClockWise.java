package january22;

import java.util.Scanner;

public class rotateMatrix90AntiClockWise {

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

        int[][] result=new int[col][row];
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                result[row-1-j][i]=matrix[i][j];
            }
        }
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }

    }
}
