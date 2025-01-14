package Stringss;

public class longestPalindromeSubString {
    public static String longestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }

        String longest = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {

                String substring = s.substring(i, j + 1);


                if (isPalindrome(substring)) {
                    if (substring.length() > longest.length()) {
                        longest = substring;
                    }
                }
            }
        }

        return longest;
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
            String input = "babad";
            String result = longestPalindrome(input);
            System.out.println(result);
        }
    }


