package january15;

public class subArrayWithProductLessThanK {

        public static int findProduct(int[] nums, int k) {
            int product = 1;
            int count = 0;
            int temp = 0;

            for (int i = 0; i < nums.length; i++) {
                product =product*   nums[i];

                while (product >= k) {
                    product /= nums[temp];
                    temp++;
                }


                count += (i - temp + 1);
            }

            return count;
        }

        public static void main(String[] args) {
            int[] nums = {10, 5, 2, 6};
            int k = 100;

            System.out.println(findProduct(nums, k));
        }
    }


