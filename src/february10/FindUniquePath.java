package february10;

public class FindUniquePath {
        public static int uniquePaths(int row, int col) {
            if (row < 1 || col < 1) {
                return 0;
            }

            if (row == 1 && col == 1) {
                return 1;
            }

            return uniquePaths(row - 1, col) + uniquePaths(row, col- 1);
        }

        public static void main(String[] args) {
            int row = 3, col = 3;
            System.out.println("total  paths: " + uniquePaths(row, col));
        }
    }


