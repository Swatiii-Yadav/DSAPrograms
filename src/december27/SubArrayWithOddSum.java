package december27;

public class SubArrayWithOddSum {
    static int countOddSum(int arr[], int n)
    {
        int result = 0;

        for (int i = 0; i <n ; i++) {
            int count = 0;
            for (int j = i; j < n ; j++) {
                count += + arr[j];
                if (count % 2 != 0)
                    result++;
            }
        }
        return result;
    }


    public static void main(String[] args)
    {
        int arr[] = { 7,9,1,23,0,7,4,2 };
        int n = arr.length;
        System.out.println(countOddSum(arr, n));
    }
}
