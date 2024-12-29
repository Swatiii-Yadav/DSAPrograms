package december28;

public class FirstMissingPositive {
    public static void main(String[] args) {
int []arr={7,8,9,11,12};
firstMissingPositive(arr);

    }
        public static int firstMissingPositive(int[] arr) {

            int low=0;
            while(low<arr.length){
                int correct_idx=arr[low]-1;
                if (arr[low]>0 && arr[low]<=arr.length
                        &&arr[low]!=arr[correct_idx]){
                    int temp=arr[low];
                    arr[low]=arr[correct_idx];
                    arr[correct_idx]=temp;
                }
                else {
                    low++;
                }

            }
            for(int i=0;i<arr.length;i++){
                if(arr[i]!=i+1){
                    return i+1;
                }
            }



            return arr.length+1;
    }
}
