package december28;

public class KthSmallestPrimefac {

        public static int[] PrimeFraction(int[] arr, int k) {
            int n = arr.length;
            int[][] result = new int[n * (n - 1) / 2][2];
            int index = 0;

            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    result[index][0] = arr[i];
                    result[index][1] = arr[j];
                    index++;
                }
            }


            for (int i = 0; i < result.length; i++) {
                for (int j = i + 1; j < result.length; j++) {
                    double first = (double) result[i][0] / result[i][1];
                    double second = (double) result[j][0] / result[j][1];
                    if (first > second) {
                        int[] temp = result[i];
                        result[i] = result[j];
                        result[j] = temp;
                    }
                }
            }

            return result[k - 1];
        }

        public static void main(String[] args) {

            int[] arr1 = {1, 2, 3, 5};
            int k1 = 3;
            int[] result = PrimeFraction(arr1, k1);
            System.out.println("result: " + result[0] + ", " + result[1]);


        }
    }





