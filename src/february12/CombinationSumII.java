package february12;
import java.util.*;
public class CombinationSumII {
        static int[][] result;
         static int count = 0;

        static void findComb(int ind, int[] arr, int target, int[] res, int index) {
            if (target == 0) {
                result[count++] = Arrays.copyOf(res, index);
                return;
            }

            for (int i = ind; i < arr.length; i++) {
                if (i > ind && arr[i] == arr[i - 1]) {
                    continue;
                }
                if (arr[i] > target) {
                    break;
                }
                res[index] = arr[i];
                findComb(i + 1, arr, target - arr[i], res, index + 1);
            }
        }

        public static int[][] combinationSum2(int[] arr, int target) {
            Arrays.sort(arr);
            result = new int[100][target];
            count = 0;
            int[] res = new int[target];
            findComb(0, arr, target, res, 0);
            int[][] finalResult = new int[count][];
            for (int i = 0; i < count; i++) {
                finalResult[i] = Arrays.copyOf(result[i], target);
            }

            return finalResult;
        }

      static   void printArr(int [][]arr) {
            for (int i = 0; i < count; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    if (arr[i][j] != 0) {
                        System.out.print(+arr[i][j] + " ");
                    }

                }
                System.out.println();
            }
        }
        public static void main(String[] args) {
            int[] input = {10, 1, 2, 7, 6, 1, 5};
            int target = 8;
            int[][] arr = combinationSum2(input, target);
            System.out.println("Result sets");
            printArr(arr);


    }

}
