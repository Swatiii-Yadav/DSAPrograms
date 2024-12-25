package december25;


public class MaxSumSubarray {
    // find the max sum within the k winwo
    public static int  findMAx(int[]arr,int k,int n){

        int maxSum = 0;
        for (int i = 0; i < n - k + 1; i++) {
            int current_sum = 0;
            for (int j = 0; j < k; j++)
                current_sum = current_sum + arr[i + j];

            // Update result if required.
            maxSum = Math.max(current_sum, maxSum);
        }

        return maxSum;
    }



    public static void main(String[] args) {
        int []arr={2,4,8,9,5};
        int wSize=3;
        System.out.println(findMAx(arr,wSize, arr.length));
    }
}
