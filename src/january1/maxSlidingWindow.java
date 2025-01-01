package january1;

public class maxSlidingWindow {
    public static int[] maxSum(int[] nums, int k) {
        int n = nums.length;
        if (n == 0 || k == 0) {
            return new int[0];  // If the array is empty or k is 0, return empty array
        }

        int numOfWindow = n - k + 1;
        int[] result = new int[numOfWindow]; // Result array to store maximums of each window

        for (int start = 0; start < numOfWindow; ++start) {
            int end = start + k - 1;
            int maxVal = nums[start]; // Initialize the max value to the first element in the window

            // Loop through the window to find the maximum element
            for (int i = start + 1; i <= end; ++i) {
                if (nums[i] > maxVal) { // If the current element is greater, update the max value
                    maxVal = nums[i];
                }
            }

            result[start] = maxVal; // Store the maximum value for the current window
        }

        return result;
    }

    public static void main(String[] args) {
        int []arr={1,3,-1,-3,5,3,6,7};
        int k=3;
        int []ans= maxSum(arr,k);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }    }

}
