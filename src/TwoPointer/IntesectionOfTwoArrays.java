package TwoPointer;

public class IntesectionOfTwoArrays {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 3, 4, 5, 6};
        int b[] = {3, 3, 5};
        int i = 0, j = 0,k=0;
        int result[] = new int[Math.min(a.length , b.length)];
        while (i < a.length && j < b.length) {
            if (a[i] == b[j]) {
                result[k++] = a[i];
                i++;
                j++;
            }
            else if (a[i]<b[j]){
                i++;
            }
            else{
                j++;
            }
        }


        for (int x = 0; x < k; x++) {
            System.out.print(result[x]+" ");
        }

    }
}
