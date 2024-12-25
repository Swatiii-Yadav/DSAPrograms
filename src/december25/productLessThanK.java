package december25;

public class productLessThanK {

        public int findProduct(int[] nums, int k) {
            if (k <= 1) return 0;

            int product = 1;
            int count = 0;
            int low = 0;

            for (int i = 0; i < nums.length; i++) {
                product *= nums[i];


                while (product >= k && low <= i) {
                    product /= nums[low];
                    low++;
                }

                // All subarrays ending at 'right' and starting from 'left' to 'right' are valid
                count += (i - low + 1);
            }

            return count;
        }

        public static void main(String[] args) {
            productLessThanK resuli = new productLessThanK();


            int[] nums1 = {10, 5, 2, 6};
            int k = 100;
            System.out.println( resuli.findProduct(nums1, k));


    }
}


