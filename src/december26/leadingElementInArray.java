package december26;
//in this problem an array is given and we have to find a leading element,a leading element is a num if
//its strictly  greater than its right element
//take an example  {6,7,4,3,5,2}-->{7,5,2}
//by defoult last element and MAx element in the array is in the result;


public class leadingElementInArray {
    public static  void findElement(int[]arr){
        int[]result=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int idx=i+1;
            while(idx< arr.length){
                if (arr[idx]>arr[i]){

                    break;

                }
                idx++;
            }
            if (idx== arr.length) {
                result[i] = arr[i];
            }        }
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+" ");
        }
    }
    public static void main(String[] args) {
        int []arr={6,7,4,3,5,2};
        findElement(arr);
    }
}
