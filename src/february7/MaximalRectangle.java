package february7;

public class MaximalRectangle {
    public int maximalRectangle(char[][] matrix) {
        if (matrix.length == 0 ){
            return 0;
        }

        int row = matrix.length;
        int col = matrix[0].length;
        int max= 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] =='1') {
                    max= Math.max(max, maxArea(matrix, i, j));
                }
            }
        }
        return max;
    }
    private int maxArea(char[][] matrix, int row, int col) {
        int max = 0;
        int min = Integer.MAX_VALUE;

        for (int i = row; i < matrix.length; i++) {
            if (matrix[i][col] == '0')
                break;

            int width = 0;

            for (int j = col; j < matrix[0].length && matrix[i][j] == '1'; j++) {
                width++;
            }

            min = Math.min(min, width);
            int height = (i - row + 1);
            max = Math.max(max, min * height);
        }

        return max;
    }

    public static void main(String[] args) {
        MaximalRectangle mr = new MaximalRectangle();
        char[][] matrix = {{'1', '0', '0'}, {'1', '0', '1'}, {'1', '1', '0'}};
        System.out.println("max are: " + mr.maximalRectangle(matrix));
    }
}
