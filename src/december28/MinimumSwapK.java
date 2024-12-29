package december28;

public class MinimumSwapK {

        public static int minSwaps(int[] arr, int k) {
            int n = arr.length;
            int temp = 0;
            int count = 0;
            for (int i=0;i<arr.length;i++) {
                if (arr[i]<= k) {
                    count++;
                }
            }
            if (count == 0 || count == n) {
                return 0;
            }
            for (int i = 0; i < count; i++) {
                if (arr[i] > k) {
                    temp++;
                }
            }
            int minswaps = temp;
            for (int i = 0, j = count; j < n; i++, j++) {
                if (arr[i] > k) {
                    temp--;
                }

                if (arr[j] > k) {
                    temp++;
                }

                minswaps = Math.min(minswaps, temp);
            }

            return minswaps;
        }

        public static void main(String[] args) {
            int[] arr1 = {2, 1, 5, 6, 3};
            int k1 = 3;
            System.out.println( minSwaps(arr1, k1));

        }
    }

