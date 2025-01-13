package Arrays;

public class MergeTwoSortedArr {
    public static void main(String[] args) {
        int []arr1={4,1,3,8};
        int []arr2={9,11,2,5};
        int []result=new int[arr1.length+arr2.length];
        for (int i=0;i< arr1.length;i++){
            result[i]=arr1[i];
        }
        for (int i=0;i< arr2.length;i++){
            result[arr1.length+i]=arr2[i];
        }
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+"  ");
        }
    }
}
