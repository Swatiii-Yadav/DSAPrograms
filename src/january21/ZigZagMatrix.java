package january21;

import java.util.Scanner;

public class ZigZagMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Insert row value");
        int row=sc.nextInt();
        System.out.println("Insert col value");
        int col=sc.nextInt();
        int  [][] matrix= new int[row][col];
        System.out.println("Insert  value into matrix");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        for (int i=0;i<row;i++){
            if (i%2==0){
                for(int j=0;j<col;j++) {
                    System.out.print(matrix[i][j]+" ");
                }
            }
            else{
                for(int j=col-1;j>=0;j--) {
                    System.out.print(matrix[i][j]+" ");
                }
            }
        }
    }
}
