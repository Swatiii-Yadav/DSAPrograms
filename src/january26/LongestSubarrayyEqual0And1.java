package january26;

public class LongestSubarrayyEqual0And1 {
    public static void main(String[] args) {
        int max=0;
        int []arr={1,0,0};
        for (int i = 0; i < arr.length; i++) {
            int count0 = 0, count1 = 0;
            for (int j = i; j < arr.length; j++) {

                if (arr[j] == 0) {
                    count0++;
                } else {
                    count1++;
                }

                if (count0 == count1) {
                    max = Math.max(max, j - i + 1);
                }
            }
        }
        System.out.println(max+" is the maximum subarray");
    }
}
