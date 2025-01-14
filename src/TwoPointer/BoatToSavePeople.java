package TwoPointer;
import java.util.*;
public class BoatToSavePeople {
    /*You are given an array people where people[i] is the weight of the ith person,
    and an infinite number of boats where each boat can carry a maximum weight of limit.
    Each boat carries at most two people at the same time, provided the sum of the weight of those people is at most limit.
      Return the minimum number of boats to carry every given person*/

    public static int numOfBoats(int[] arr, int limit) {
        int low=0;
        int i=1;
        int high = arr.length-1;
        int count = 0;
        Arrays.sort(arr);
        while(low<=high){
            if( arr[low] + arr[high] <= limit) {
                count ++;
                low++;
                high--;

            }
            else{
                count++;
                high--;
            }

        }
        return count;
    }
    public static void main(String[] args) {
int[] arr={1,2};
int limit=3;
        System.out.println(numOfBoats(arr,limit));
    }
}
