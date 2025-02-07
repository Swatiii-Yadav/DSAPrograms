package february6;

public class SubsetSum {

    public static boolean isSum(int[] arr, int target, int n) {

        if (target == 0) {
            return true;
        }

        if (n <= 0){
            return false;
        }

        int end = arr[n - 1];

        if (end > target) {
            return isSum(arr, target,n - 1 );
        }

        boolean curr1 = isSum(arr, target,n - 1);
        boolean curr2 = isSum(arr, target - end,n - 1 );

        return curr1 || curr2;
    }
    public static void main(String[] args) {
        int[] arr = {13, 114, 4, 12, 50, 72};
        int target = 84;
        int n = arr.length;

            System.out.println( isSum(arr, target,n));
    }
}
