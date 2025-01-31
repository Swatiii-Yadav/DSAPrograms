package january30;

public class NOSubArrayWithSumDivisibleByX {
    static void findSum(int[] arr, int X) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];

                if (j - i + 1 > 1 && sum % X == 0) {

                        count++;
                    System.out.print("{");
                        for (int k = i; k <= j; k++) {
                            if (i != j) {

                            System.out.print(arr[k] + "  ");
                        }
                    }
                    System.out.print("}");
                }
            }
            System.out.println();
        }
        System.out.println(" No of count : "+count);

    }

    public static void main(String[] args) {
        int[] arr = {4,5,0,-2,-3,1};
        int X=5;
        findSum(arr,X);


    }
}
