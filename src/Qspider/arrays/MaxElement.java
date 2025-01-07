package Qspider.arrays;

public class MaxElement {
    public static void main(String[] args) {
        int[] arr={13,15,12,17,16,14};
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
