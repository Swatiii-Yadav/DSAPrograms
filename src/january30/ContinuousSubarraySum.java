package january30;

public class ContinuousSubarraySum {
    static void findSum(int[] arr, int x) {

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];

                if (j - i + 1 > 1 && sum == x) {
                    for (int k = i; k <= j; k++) {
                        System.out.print(arr[k] + "  ");
                    }
                }
            }

        }

    }

    public static void main(String[] args) {
        int[] arr = {23, 2, 4, 6, 7};
        int x = 25;


        findSum(arr, x);
    }

}
