package december23;

import java.util.ArrayList;
import java.util.List;

public class CountOfSmallerNumbersAfterSelf {

    public static List<Integer> countSmaller(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> result = new ArrayList<>();

        int[] indices = new int[n];
        int[] counts = new int[n];

        for (int i = 0; i < n; i++) {
            indices[i] = i;
        }
        sort(indices, counts, nums, 0, n - 1);
        for (int i : counts) {
            result.add(i);

        }

        return result;
    }

    public static void sort(int[] indices, int[] counts, int[] arr, int low, int high) {
        if (low < high) {
            int mid = low + (high - low) / 2;
            sort(indices, counts, arr, low, mid);
            sort(indices, counts, arr, mid + 1, high);
            mergeSort(indices, counts, arr, low, mid, high);

        }

    }

    /*In mergesort function we are taking 6 paramerters indices[],count[],arr[],low,mid,high
    arr is the originsl input array,low and high are the indicies we arae gonna use in this function.
    mid is also an index we are using in this which is gonan mid point of the array.
    indices and count are 2 other arrays ,indices   Stores the original indixes of elements
    and count Stores the count of smaller numbers for each index

    */
    public static void mergeSort(int indices[], int count[], int[] arr, int low, int mid, int high) {
        int n1 = mid - low + 1;
        int n2 = high - mid;

        int left[] = new int[n1];
        int right[] = new int[n2];

        for (int i = 0; i < n1; i++) {
            left[i] = indices[low + i];
        }

        for (int j = 0; j < n2; j++) {
            right[j] = indices[mid + 1 + j];
        }

        int i = 0, j = 0, k = low, rightCount = 0;


            /*
            here we first  check if i and j are less than n1 and n2
            next check for the condition
            if an element in the left half (nums[leftIndices[i]]) is less than or equal to an element
            in the right half (nums[rightIndices[j]]), it means no smaller element from the right half
             comes before nums[leftIndices[i]]. Hence, the count remains the same.
            */
            /*If an element in the right half is smaller, the number of such elements (rightCount)
             is added to counts[leftIndices[i]].*/
            /*rightCount keeps track of how many elements from the right half are smaller than the current element being processed from the left half.
           Whenever an element from the left half is inserted back into the sorted array,
           rightCount is added to its corresponding count in the counts array.*/

        while (i < n1 && j < n2) {
            if (arr[left[i]] <= arr[right[j]]) {
                count[left[i]] += rightCount;
                indices[k++] = left[i++];
            } else {
                rightCount++;
                indices[k++] = right[j++];
            }
        }

        while (i < n1) {
            count[left[i]] += rightCount;
            indices[k++] = left[i++];
        }

        while (j < n2) {
            indices[k++] = right[j++];
        }
    }


    public static void main(String[] args) {
        int[] arr = {5, 2, 6, 3, 1};
        System.out.println(countSmaller(arr));

    }
}
