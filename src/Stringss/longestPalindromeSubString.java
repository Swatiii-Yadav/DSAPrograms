package Stringss;

public class longestPalindromeSubString {
         public static String result(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }

        String blank = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {

                String substrings = s.substring(i, j + 1);


                if (isPalindrome(substrings)) {
                    if (substrings.length() > blank.length()) {
                        blank = substrings;
                    }
                }
            }
        }

        return blank;
    }

    private static boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
            
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
            String str = "babad";
            String answer = result(str);
            System.out.println(answer);
        }
    }


