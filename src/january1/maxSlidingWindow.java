package january1;

public class maxSlidingWindow {
    public static int[] maxSum(int[] nums, int k) {
        int n = nums.length;


        int numOfWindow = n - k + 1;
        int[] result = new int[numOfWindow];

        for (int i = 0; i < numOfWindow; i++) {
            int size = i + k - 1;
            int max = nums[i];
            for (int j = i + 1; j<= size; j++) {
                if (nums[j] > max) {
                    max = nums[j];
                }
            }

            result[i] = max;
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
