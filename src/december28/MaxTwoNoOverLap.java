package december28;

public class MaxTwoNoOverLap {

        public static  int maxSum(int[] nums, int first, int second) {
            int maxSum = 0;

            for (int i = 0; i <= nums.length - first; i++) {
                int firstSum = 0;
                for (int j = i; j < i + first; j++) {
                    firstSum += nums[j];
                }
                for (int j= i + first; j <= nums.length - second; j++) {
                    int secondSum = 0;
                    for (int k = j; k < j + second; k++) {
                        secondSum += nums[k];
                    }
                    maxSum = Math.max(maxSum, firstSum + secondSum);
                }
                for (int j = 0; j < i - second + 1; j++) {
                    int secondSum = 0;
                    for (int k = j; k < j + second; k++) {
                        secondSum += nums[k];
                    }
                    maxSum = Math.max(maxSum, firstSum + secondSum);
                }
            }

            return maxSum;
        }

        public static void main(String[] args) {
            int[] nums = {0, 6, 5, 2, 2, 5, 1, 9, 4};
            int first = 1, second = 2;
            int maxSum=maxSum(nums, first, second);
            System.out.println(maxSum);
           }
    }



