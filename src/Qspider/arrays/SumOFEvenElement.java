package Qspider.arrays;

public class SumOFEvenElement {
    public static void main(String[] args) {
        int[] arr={2,3,5,6,8,2,2,2};
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2==0){
                sum+=arr[i];
            }
        }
        System.out.println(sum);
    }
}
