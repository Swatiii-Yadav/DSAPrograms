package january22;

import java.util.Scanner;

public class findMaxEleInEachRow {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Row");
        int row=sc.nextInt();
        System.out.println("Row");
        int col=sc.nextInt();
        System.out.println("Elements ");
        int [][] matrix=new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j=0;j<col;j++){
                matrix[i][j]=sc.nextInt();
            }
        }

        for (int i=0;i<row;i++){
            int max=0;
            for (int j=0;j<col;j++){
                if (matrix[i][j]>max){
                    max=matrix[i][j];
                }
            }
            System.out.println("max of row "+i+" is "+max);
        }

    }
}
