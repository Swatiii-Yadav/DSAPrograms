package january15;

public class LongestSubArrayWithGivenSum {
    public static int getLongestSubarray(int []a, int k) {
        int n = a.length;

        int res = 0;
        for (int i = 0; i < n; i++) {
       for (int j = i; j < n; j++) {
                int  sub = 0;
                for (int K = i; K <= j; K++) {
                    sub =sub+ a[K];
                }

                if (sub == k)
                    res = Math.max(res, j - i + 1);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] a = {2, 3, 5, 1, 9};
        int  k = 10;
        System.out.println( getLongestSubarray(a, k));
    }

}
