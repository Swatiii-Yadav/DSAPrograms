package TwoPointer;

public class UnionOfTwoArray {

        public static int[] union(int[] a, int[] b) {
           int[] result = new int[a.length+ b.length];
            int i = 0, j = 0,k=0;


            while (i < a.length && j < b.length) {
                if (a[i] < b[j]) {
                    result [k]= a[i];
                    i++;
                    k++;
                }
       else if (a[i] > b[j]) {
                    result[k]=b[j];
                    j++;
                    k++;} else {
                    result[k]=a[i];
                    i++;
                    j++;
                    k++;
                }
            }


            while (i < a.length) {
                result[k]=a[i];
                i++;
            }

            while (j < b.length) {
                result[k]=b[j];
                k++;
                j++;
            }

            return result;
        }

        public static void main(String[] args) {
            int[] a = {1, 2, 3, 4, 5};
            int[] b = {3, 4, 5, 6, 7};

           int[] result = union(a, b);
            for (int i = 0; i < result.length; i++) {
                System.out.print(result[i]+" ");
            }
        }
    }


