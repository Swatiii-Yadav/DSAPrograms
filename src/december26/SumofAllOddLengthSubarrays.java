package december26;

public class SumofAllOddLengthSubarrays {

public static int FindSum(int[]arr) {
    int n = arr.length;
    int totalSum = 0;

    for (int i = 0; i < n; i++) {
        for (int j = i; j < n; j++) {
            int subarrayLen = j - i + 1;
            if (subarrayLen% 2 == 1) {
                int subarraySum = 0;
                for (int k = i; k <= j; k++) {
                    subarraySum += arr[k];
                }
                totalSum += subarraySum;
            }
        }
    }

    return totalSum;
}

public static void main(String[] args) {
    int[] arr = {1, 4, 2, 5, 3};
    System.out.println(FindSum(arr));
}
}