package january26;

import java.util.Scanner;

public class SaddlePointInMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Row:");
        int row=sc.nextInt();
        System.out.println("col:");
        int col=sc.nextInt();
        System.out.println("Insert element into matrix:");
        int[][] matrix=new int[row][col];
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
      /***check saddle point***/

  for (int i=0;i<row;i++){
      int minRow=matrix[i][0],colIndex=0;
      boolean checkPoint=true;
      for (int j=0;j<col;j++){
          if (minRow>matrix[i][j]){
              minRow=matrix[i][j];
              colIndex=j;
          }
      }
      for (int j = 0; j < matrix.length; j++)
      {
          if(matrix[j][colIndex] > minRow)
          {
              checkPoint = false;

              break;
          }
      }

      if(checkPoint)
      {
          System.out.println("Saddle Point is : "+minRow);
      }
  }

    }
}
