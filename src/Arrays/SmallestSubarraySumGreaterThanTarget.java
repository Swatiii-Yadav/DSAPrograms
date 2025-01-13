package Arrays;

public class SmallestSubarraySumGreaterThanTarget {
    public static void main(String[] args) {
        int []arr={5,4,3,2,1,8,12,6};
        int sum=arr[0];
        int max=arr[0];
        int count=0;
        int target=12;
        for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i];
            if (sum>target){
                count++;
            }

        }
        System.out.println(count);
    }
}
