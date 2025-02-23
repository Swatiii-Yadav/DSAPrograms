package december26;

public class ValidMountainArray {

    public static boolean Check(int[] arr) {
        int n = arr.length;

        if (n < 3) {
            return false;
        }
        int i = 0;

        while (i + 1 < n && arr[i] < arr[i + 1]) {
            i++;
        }
        if (i == 0 || i == n - 1) {
            return false;
        }
        while (i + 1 < n && arr[i] > arr[i + 1]) {
            i++;
        }
        return i == n - 1;
    }

    public static void main(String[] args) {
        int []arr={0,3,2,1};
        System.out.println(Check(arr));
    }

}
