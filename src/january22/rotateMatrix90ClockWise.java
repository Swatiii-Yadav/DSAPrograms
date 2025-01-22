package january22;

import java.util.Scanner;

public class rotateMatrix90ClockWise {
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

        int[][] answer=new int[row][col];
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                answer[j][row-1-i]=matrix[i][j];
            }
        }
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                System.out.print(answer[i][j]+" ");
            }
            System.out.println();
        }

    }
}
