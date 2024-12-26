package december26;
/*in this program we are gonna find the product of each element resent in an array
except shelf means--> suppose we have given an arry {6, 9, 1, 3,4,5} so except arr[x] elment we consider
all other element ,at each index we update the product of array*/


public class ProductOfArrayExceptShelf {
    public static void findProduct(int[] arr) {
        int curr = 1;
        int n = arr.length;
        int[] result = new int[n];

        int tempLeft= 1;
        int tempRight = 1;


        for (int i = 0; i < n; i++) {
            result[i] = tempLeft;
            tempLeft *= arr[i];
        }

        for (int i = n - 1; i >= 0; i--) {
            result[i] *= tempRight;
            tempRight *= arr[i];
        }


        for (int i=0;i<n;i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {6, 9, 1, 3,4,5};
        findProduct(arr);
    }

}
