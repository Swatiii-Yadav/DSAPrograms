package january21;

public class SubArrayDivisibleByK {

        public static int countSub(int[] arr, int k) {
            int n = arr.length;
            int count = 0;

            for (int i = 0; i < n; i++) {
                int sum = 0;
                for (int j = i; j < n; j++) {
                    sum += arr[j];
                    if (sum % k == 0) {
                        count++;
                    }
                }
            }
            return count;
        }


    public static void main(String[] args) {
        int[] arr = {4, 5, 0, -2, -3, 1};
        int k = 5;
        System.out.println(countSub(arr, k));
    }

}
