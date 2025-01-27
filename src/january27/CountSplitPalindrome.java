package january27;

public class CountSplitPalindrome {

        static boolean isPalindrome(String str) {
            int low = 0, high = str.length() - 1;
            while (low <= high) {
                if (str.charAt(low) != str.charAt(high)) {
                    return false;
                }
                low++;
                high--;
            }
            return true;
        }

    static int countPalindromeSplits(String s) {
        int count = 0;
        int n = s.length();
        for (int i = 1; i < n; i++) {
            String s1 = s.substring(0, i);
            String s2 = s.substring(i);
            if (isPalindrome(s1) && isPalindrome(s2)) {
                count++;
            }
        }

        return count;
    }
    public static void main(String[] args) {
            String S = "bbaa";  // Example string
            System.out.println("total count : " + countPalindromeSplits(S));
        }


}
