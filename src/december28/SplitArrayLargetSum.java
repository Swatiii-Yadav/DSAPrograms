package december28;

public class SplitArrayLargetSum {

    public  static int splitArray(int[] nums, int k) {
            int maxEle= 0;
            int sum = 0;
            for (int i=0;i<nums.length;i++) {
                maxEle= Math.max(maxEle, nums[i]);
                sum += nums[i];
            }

            int left = maxEle;
            int right = sum;
            int result = sum;

            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (Split(nums, k, mid)) {
                    result = mid;
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }

            return result;
        }


       static boolean Split(int[] nums, int k, int maxSum) {
            int currSum = 0;
            int count = 1;

            for (int i=0;i< nums.length;i++) {
                if (currSum + nums[i] > maxSum) {
                    count++;
                    currSum = nums[i];
                    if (count > k) {
                        return false;
                    }
                } else {
                    currSum += nums[i];
                }
            }

            return true;
        }

    public static void main(String[] args) {
        int[]arr={7,2,5,10,8};
                int result=splitArray(arr,2);
        System.out.println(result);

    }
    }

