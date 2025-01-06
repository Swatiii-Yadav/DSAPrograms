package Qspider.arrays;

public class AvgOfElement {

    public static void main(String[] args) {
        int[] arr={5,11,10,16,18,13};
        int  sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        System.out.println(sum/ arr.length);
    }
}
