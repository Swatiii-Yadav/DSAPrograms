package january17;

public class countPalindromicString
{

    public static int count(String s) {
            int count = 0;


            for (int i = 0; i < s.length(); i++) {
                for (int j = i + 1; j <= s.length(); j++) {
                    String substring = s.substring(i, j);


                    if (isPalindrome(substring)) {
                        count++;
                    }
                }
            }

            return count;
        }


        private static boolean isPalindrome(String s) {
            int left = 0;
            int right = s.length() - 1;


            while (left < right) {
                if (s.charAt(left) != s.charAt(right)) {
                    return false;
                }
                left++;
                right--;
            }

            return true;

    }
    public static void main(String[] args) {
        String s = "aa";
        int count = count(s);
        System.out.println(count);
    }

}
