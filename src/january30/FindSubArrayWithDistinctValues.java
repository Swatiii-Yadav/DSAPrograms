package january30;

public class FindSubArrayWithDistinctValues
{
    static void findSUbArray(int[] arr){
        int startIndex=0;
        int maxIndex=0;
        for (int i = 0; i < arr.length; i++) {
            boolean unique=true;
            for (int j=i;j<arr.length;j++) {
                for (int k = i; k < j; k++) {
                    if (arr[k] == arr[j]) {
                        unique = false;
                        break;
                    }
                }
                if (!unique) {
                    break;
                }
                if ((j-i)+1 >maxIndex){
                    maxIndex = j - i + 1;
                    startIndex = i;
                }
            }


        }
        for (int i=startIndex;i<startIndex+maxIndex;i++){
            System.out.print(arr[i]+" ");

        }
    }
    public static void main(String[] args) {
        int[] arr={4,6,7,1,2,90,6,7,54,39};//output-->{4,6,7,1,2,90}
        findSUbArray(arr);
    }

}
