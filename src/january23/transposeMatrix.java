package january23;

import java.util.Scanner;

public class transposeMatrix {
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
        //transfer element of mat into answer matrix
        int[][]answer=new int[col][row];
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                answer[j][i]=mat[i][j];
            }
        }
        //print
        for (int i=0;i<col;i++){
            for (int j=0;j<row;j++){
                System.out.print(answer[i][j]+" ");
            }
            System.out.println();
        }
    }
}
