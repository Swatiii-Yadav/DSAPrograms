package Arrays;

public class ReverseByTwoPointer {
    public static void reverse(int[] arr){
        int low=0,high= arr.length-1;
        while (low<high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;

            low++;
            high--;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }


    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};

        reverse(arr);

    }
}
