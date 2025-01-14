package TwoPointer;

public class RemoveDuplicatesByTwoPointer {

    public static void removeDuplicate(int[] arr){
        int i=0;
        int j=i+1;
        while (i< j && j< arr.length){
            if (arr[i]!=arr[j]) {
                System.out.print(arr[i] + " ");
            }
            i++;
            j++;

        }
    }

    public static void main(String[] args) {
        int[] arr={4,1,1,2,1,3};
        removeDuplicate(arr);
    }
}
