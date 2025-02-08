package february7;

public class MaxSumSquareSubmatrix {
    public int maxSquSubmat(int[][] matrix, int k) {
        if (matrix.length == 0) {
            return 0;
        }

        int row = matrix.length;
        int col = matrix[0].length;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i <= row - k; i++) {
            for (int j = 0; j <= col - k; j++) {
                max = Math.max(max, getSum(matrix, i, j, k));
            }
        }

        return max;
    }
    private int getSum(int[][] matrix, int row, int col, int k) {
        int sum = 0;
        for (int i = row; i < row + k; i++) {
            for (int j = col; j < col + k; j++) {
                sum += matrix[i][j];
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        MaxSumSquareSubmatrix obj = new MaxSumSquareSubmatrix();
        int[][] matrix = {
                {1, 2, 3, 4},
                {5,6, 7, 8},
                {9,10,11, 12}
        };

        int k = 3;
        int maxSum = obj.maxSquSubmat(matrix, k);
        System.out.println("max  sum : " + maxSum);
    }

}
