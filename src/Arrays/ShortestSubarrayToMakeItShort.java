package Arrays;

public class ShortestSubarrayToMakeItShort {
    public  static int findLength(int[] arr) {
        int count=0;
        int right = arr.length-1;
        int left = 0;
        while (left <right && arr[left] <= arr[left + 1]) {
            left++;
        }

        if (left == right) {
            return 0;
        }



        while (right > 0 && arr[right - 1] <= arr[right]) {
            right--;
        }


        int subArray = Math.min(arr.length - left - 1, right);

        int i = 0, j = right;
        while (i <= left && j < arr.length) {
            if (arr[i] <= arr[j]) {
                 subArray  = Math.min(subArray , j - i - 1);
                i++;
            }
            else {
                j++;
            }
        }

        return subArray ;
    }
    public static void main(String[] args) {
int[] arr={5,4,3,2,1};
        System.out.println(findLength(arr));
    }
}
