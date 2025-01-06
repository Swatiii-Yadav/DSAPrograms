package Qspider.arrays;

public class SumOfOddElement {
    public static void main(String[] args) {
        int[] arr={2,6,7,3,1,13,16,17};
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                sum += arr[i];
            }
        }
        System.out.println(sum);
    }
}
