package january30;

public class LongestSubArrayHavingSumOfElementsAtMostK {
    static void LongestSubArray(int[] arr, int K) {
        int maxx = 0, start = 0, end = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum <= K) {
                    if (j - i + 1 > maxx) {
                        maxx = j - i + 1;
                        start = i;
                        end = j;
                    }
                }
             else {
                 break;
                }
            }

        }
        System.out.println("Longest subArray: " + maxx);
        System.out.println("Starting from " + start + " to " + end);

    }

    public static void main(String[] args) {
        int[] arr = {4, 6, 1, 7, 8, 13};
        int K = 29;
        LongestSubArray(arr, K);

    }
}
