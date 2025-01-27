package january27;
//check for the longest palindromic substring of even length exist or not
//if longest substring with odd number exist then return substring with even length and length less than longest

public class PalindromicSubstringOfEvenLength {
    static boolean checkPalindrome(String str) {
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

    static void checkEvenPalindromicSubString(String str) {
        String longPalindromicSubString = "";
        int curr = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                String sub = str.substring(i, j);
                if (checkPalindrome(sub) && sub.length() % 2 == 0) {
                    if (sub.length() > curr) {
                        curr = sub.length();
                        longPalindromicSubString = sub;
                    }

                }
            }
        }
        System.out.println("Longest  Even Palindromic Substring = " + longPalindromicSubString);
        System.out.println("Length of substring = " + curr);
    }

    public static void main(String[] args) {
        String str = "aaabbbbbcccczzxyz";
        checkEvenPalindromicSubString(str);
    }
}
