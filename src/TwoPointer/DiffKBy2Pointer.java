package TwoPointer;

public class DiffKBy2Pointer {
    public static boolean diffK(int[] arr,int k){
        int low=0,high=1;
        while (low<high && high< arr.length){
            int diff=arr[high]-arr[low];
            if (diff==k && low!=high){
                return true;
            }
            else if(diff<k){
                high++;}

            low++;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr={1,3,6};
        int k=2;
        System.out.println(diffK(arr,k));

    }
}
