package february4;

public class SubstSumArray {
    static int[] sumOfSubSet;
    static int index = 0;

    public static void findset(int[] arr, int n, int start, int sum) {
        if (start == n) {
            sumOfSubSet[index++] = sum;
            return;
        }

        findset(arr, n, start + 1, sum + arr[start]);
        findset(arr, n, start + 1, sum);
    }

    public static int[] getSubsetSums(int[] arr) {
        int totalSubsets = 1 << arr.length;  // 2^n  sums are possibul
        sumOfSubSet = new int[totalSubsets];
        index = 0;
        findset(arr, arr.length, 0, 0);
        return sumOfSubSet;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
           int[]result = getSubsetSums(arr);
        System.out.println("output:");
        for (int sum : result) {
            System.out.print(sum + " ");
        }
    }
}
