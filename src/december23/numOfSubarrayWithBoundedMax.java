package december23;

public class numOfSubarrayWithBoundedMax {
    public static int numSubarrayBoundedMaxValue(int[] nums, int left, int right) {
        int result=countSubarrays(nums, right) - countSubarrays(nums, left - 1);
        return result ;
    }

    private static int countSubarrays(int[] nums, int bound) {
        int count = 0, current = 0;

        for (int num : nums) {
            if (num <= bound) {
                current++; // Extend the valid subarray
                count += current; // Add all subarrays ending at this position
            } else {
                current = 0; // Reset the current count
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = {2,1,4,3};
        System.out.println(numSubarrayBoundedMaxValue(arr,2,3));
    }
}
