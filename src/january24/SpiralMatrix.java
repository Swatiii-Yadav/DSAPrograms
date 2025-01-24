package january24;

import java.util.Scanner;

public class SpiralMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Row:");
        int row = sc.nextInt();
        System.out.println("col:");
        int col = sc.nextInt();
        int[][] mat = new int[row][col];
        System.out.println("Insert value into matrix");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        int left = 0;//it traverse from left to right
        int top = 0;//it traverse from top to bottom
        int bottom = row - 1;//it traverse from bottom to top
        int right = col - 1;//it traverse from   right to left
        int[][] answer = new int[row][col];

        while (top <= bottom && left <= right) {

            //left to right
            for (int i = left; i <= right; i++) {
                System.out.print(mat[top][i] + " ");
            }
            top++;

            // from right, top to bottom.
            for (int i = top; i <= bottom; i++) {
                System.out.print(mat[i][right] + " ");
            }
            right--;

            // From bottom, moving right to left.
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(mat[bottom][i] + " ");
                }
                bottom--;
            }

            // bottom to top.
            if (left <= right) {
                for (int i = bottom; i>= top; i--) {
                    System.out.print(mat[i][left] + " ");
                }
                left++;
            }
        }

        System.out.println();
    }

    }


