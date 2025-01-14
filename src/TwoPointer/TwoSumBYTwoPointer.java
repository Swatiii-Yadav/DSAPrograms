package TwoPointer;

public class TwoSumBYTwoPointer {
    //works only for sorted array\
    public static int[] findIndex(int[] arr,int target) {
        int low = 0, high =arr.length-1;
        while (low<high){
            int sum=arr[low]+arr[high];
            if (sum>arr[high]){
                high--;
            }
            else if(sum<target){
                low++;
            }
            else{
                return new int[]{low,high};
            }

        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int[] arr={2,7,11,15};
        int target=9;

    }
}
