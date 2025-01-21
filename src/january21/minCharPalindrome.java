package january21;

public class minCharPalindrome {

        public static boolean isPalindrome(String s, int i, int j) {
            while (i < j) {
                if (s.charAt(i) != s.charAt(j)) {
                    return false;
                }
                i++;
                j--;
            }
            return true;
        }

        public static int minChar(String s) {
            int count = 0;
            int i = s.length() - 1;
            while (i >= 0 && !isPalindrome(s, 0, i)) {
                i--;
                count++;
            }

            return count;
        }


    public static void main(String[] args) {
        String s = "abbc";
       minChar(s);
        System.out.println( minChar(s));
    }
}
