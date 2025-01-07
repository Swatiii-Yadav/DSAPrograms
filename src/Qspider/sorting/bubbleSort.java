package Qspider.sorting;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr={14,13,15,18,17};
        System.out.println("Before sorting");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        //sorting
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]>arr[j]){
                    int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                }

            }
        }
        System.out.println();
        System.out.println("After sorting");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
