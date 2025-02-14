package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AllSubArrayInArray {
    static void findSubArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i ; j < arr.length; j++) {
                System.out.println(j+" iteration");
                for (int k = i; k<=j; k++) {

                        System.out.print(arr[k] + " ");
                    }

                System.out.println();
            }

        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Size:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Insert element into array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        findSubArray(arr);
    }
}
