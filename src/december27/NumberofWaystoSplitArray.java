package december27;

public class NumberofWaystoSplitArray
{
    public static int  splitArray(int []nums) {

            long totalSum = 0;

            // Calculate the total sum of the array
            for (int i = 0; i < nums.length; i++) {
                totalSum += nums[i];
            }

            long prefixSum = 0;
            int valid = 0;

            // Iterate through the array to check valid splits
            for (int i = 0; i < nums.length - 1; i++) { // Ensure at least one element in the right part
                prefixSum += nums[i];
                long secondPartSum = totalSum - prefixSum;

                // Check if the split is valid
                if (prefixSum >= secondPartSum) {
                    valid++;
                }
            }

            return valid;
    }

    public static void main(String[] args) {
        int []arr={2,3,1,0};
        System.out.println(splitArray(arr));

    }
}
