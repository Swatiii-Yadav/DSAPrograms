package Arrays;

public class KadaneSAlgorithm {
    static int findMaxSubarraySum(int[] arr){
        int max=arr[0],currMAx=arr[0];
        for (int i = 0; i < arr.length; i++) {
            currMAx=Math.max(arr[i],currMAx+arr[i]);
            max=Math.max(max,currMAx);
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr={-2,1,-3,5,8,13,-4,17};
        System.out.println(findMaxSubarraySum(arr));
    }
}
