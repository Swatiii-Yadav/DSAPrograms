package january22;

import java.util.Scanner;

public class CountSortedRowsInMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Row");
        int row=sc.nextInt();
        System.out.println("col");
        int col=sc.nextInt();
        System.out.println("Elements ");
        int [][] matrix=new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j=0;j<col;j++){
                matrix[i][j]=sc.nextInt();
            }
        }


        for (int i=0;i<row;i++) {
            boolean sortedOrNot = true;
            for (int j = 0; j < col - 1; j++) {
                if (matrix[i][j] >matrix[i][j + 1]) {
                    sortedOrNot = false;
                    break;
                }
            }
            if (sortedOrNot) {
                System.out.println(i+" row is sorted");
            }
        }

    }
}
