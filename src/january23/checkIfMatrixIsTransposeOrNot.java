package january23;

import java.util.Scanner;

public class checkIfMatrixIsTransposeOrNot {
    static boolean checkSymmetry(int[][] mat,int [][] answer,int row,int col){
        //check the symmetry of matrix
        if(row!=col){
            return false;
        }
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                if(mat[i][j]!=answer[j][i]){
                    return false;
                }
            }
        }
        return true;
    }
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
        System.out.println("before transpose");
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                System.out.print(mat[i][j]);
            }
            System.out.println();
        }
        //transfer element of mat into answer matrix
        int[][]answer=new int[col][row];
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                answer[j][i]=mat[i][j];
            }
        }
        System.out.println("After transpose");
        for (int i=0;i<col;i++){
            for (int j=0;j<row;j++){
                System.out.print(answer[i][j]);
            }
            System.out.println();
        }

        System.out.println("Symmerty: "+checkSymmetry(mat,answer,row,col));

    }
}
