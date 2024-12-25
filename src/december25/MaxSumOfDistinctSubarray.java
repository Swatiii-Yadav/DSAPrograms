package december25;

public class MaxSumOfDistinctSubarray {

    public long maximumSubarraySum(int[] nums, int k) {
        int n = nums.length;
        int currSum = 0, maxSum = 0;

        int[] freq = new int[10];
        int distinctCount = 0;

        for (int i = 0; i < n; i++) {
            currSum += nums[i];
            freq[nums[i]]++;
            if (freq[nums[i]] == 1) {
                distinctCount++;
            }

            if (i >= k) {
                currSum -= nums[i - k];
                freq[nums[i - k]]--;
                if (freq[nums[i - k]] == 0) {
                    distinctCount--;
                }
            }


            if (i >= k - 1 && distinctCount == k) {
                maxSum = Math.max(maxSum, currSum);
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        MaxSumOfDistinctSubarray res = new MaxSumOfDistinctSubarray();

        int[] nums = {4, 5, 0, 5, 1, 4};
        int k = 3;


        int result = (int) res.maximumSubarraySum(nums, k);

        // Print the result
        System.out.println("Maxm Subarray Sum with " + k + " distinct element: " + result);
    }
}
