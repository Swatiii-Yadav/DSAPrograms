package leetCodePracticeQuestions;

public class SumOddLengthSubArray {
    public static int sumOfOddSubArray(int[] arr) {
        int n = arr.length;
        int[] prefixSum = new int[n + 1];


        for (int i = 0; i < n; i++) {
            prefixSum[i+1] = prefixSum[i] + arr[i];
        }

        int totalSum = 0;


        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if ((j - i + 1) % 2 == 1) {
                    totalSum += prefixSum[j + 1] - prefixSum[i];
                }
            }
        }

        return totalSum;
    }

    public static void main(String[] args) {
        int[]arr={1,4,2,5,3};
        System.out.println(sumOfOddSubArray(arr));
    }
}
