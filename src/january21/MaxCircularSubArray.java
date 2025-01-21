package january21;

public class MaxCircularSubArray {

    public static int maxSum(int[] arr) {
        int n = arr.length;
        int max = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < i + n; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += arr[k % n]; }
                       max = Math.max(max, sum);
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] arr = {5, -3, 5};
        System.out.println(maxSum(arr));
    }
}

