package Arrays;

public class MaxSumSubArray {
    public static int find(int[] arr){
        int curr=0,maxx=0;
        for (int i = 0; i < arr.length; i++) {
            curr=Math.max(arr[i],curr+arr[i]);
            maxx=Math.max(maxx,curr);
        }
        return maxx;
    }
    public static void main(String[] args) {
        int [] arr={4,8,1,2,12,17};
       find(arr);
        int result = find(arr);
        System.out.println( result);

    }
}
