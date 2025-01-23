package january23;

import java.util.Scanner;

public class PrintReverseElementInRow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Row:");
        int row = sc.nextInt();
        System.out.println("col:");
        int col = sc.nextInt();
        int[][] mat = new int[row][col];
        System.out.println("Insert value into matrix");
        for (int i = 0; i <row; i++) {
            for (int j = 0; j <col; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        //print Element in reverse of row
        for (int i=0;i<row;i++){
            for (int j=col-1;j>=0;j--){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }

    }
}
