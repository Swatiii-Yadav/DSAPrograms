package february11;

public class LongestIncreasingSubset {
    static int findSubset(int[] arr, int index, int prev) {
        if (index == arr.length) {
            return 0;
        }
        int delete = findSubset(arr, index + 1, prev);
        int add = 0;
        if (arr[index] > prev) {
            add = 1 + findSubset(arr, index + 1, arr[index]);
        }
        return Math.max(add, delete);
    }
    static int longestSubset(int[] arr) {
        return findSubset(arr, 0, Integer.MIN_VALUE);
    }


    public static void main(String[] args) {
        int[] arr={11,22,6,7,33,45,88,9,15};
        int n=arr.length;
        int i= 0;
        System.out.println(longestSubset(arr));
    }
}
