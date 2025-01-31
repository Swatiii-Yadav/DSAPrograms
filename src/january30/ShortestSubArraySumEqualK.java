package january30;

public class ShortestSubArraySumEqualK {
    static void findShortestSubArray(int[] arr, int K) {
        int min =Integer.MAX_VALUE;
                int  start = -1, end = -1;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == K) {
                    if (j-i+1<min) {
                        min = j - i + 1;
                        start = i;
                        end = j;
                    }

                }
            }

        }

        System.out.println("Shortest subArray: " + min);
        System.out.println("Starting from " + start + " to " + end);

    }

    public static void main(String[] args) {
        int[] arr = { 9, 3,6, 2, 1, 8, 2};
        int K = 11;
        findShortestSubArray(arr,K);
    }
}
