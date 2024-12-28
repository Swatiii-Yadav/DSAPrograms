package december27;

public class prefixSum {
    public static void main(String[] args) {
int []arr={6,9,1,4,23,15};
prefix(arr);

    }
    public static  void prefix(int []arr) {
        int prefixArr[] = new int[arr.length];
        prefixArr[0]=0;
        for (int i =1; i < arr.length; i++) {
            prefixArr[i]=prefixArr[i-1]+arr[i-1];
        }
        for (int i = 0; i < prefixArr.length; i++) {
            System.out.print(prefixArr[i]+" ");
        }
    }
}
