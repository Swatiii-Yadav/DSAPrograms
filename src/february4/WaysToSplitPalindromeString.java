package february4;

public class WaysToSplitPalindromeString {

        public static int countSplits(String s) {
            int count = 0;
            int n = s.length();

            for (int i = 1; i < n; i++) {
                if (isPalindrome(s,0,i - 1) && isPalindrome(s, i, n - 1)) {
                    count++;
                }
            }
            return count;
        }
    public static boolean isPalindrome(String s, int start, int end) {
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }


    public static void main(String[] args) {
            String s = "abbaebbye";
            System.out.println(" palindrome splits: " + countSplits(s));
        }


}
