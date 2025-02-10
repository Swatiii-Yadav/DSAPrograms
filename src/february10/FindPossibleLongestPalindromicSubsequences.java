package february10;

public class FindPossibleLongestPalindromicSubsequences {
        public static int countLenLongest(String s, int left, int right) {

            if (left>right){
                return 0;
            }
            if (left == right)
            { return 1;
            }
            if (s.charAt(left) == s.charAt(right)) {
                return 2 + countLenLongest(s, left + 1, right - 1);
            }
            return Math.max(countLenLongest(s, left + 1, right), countLenLongest(s, left, right - 1));
        }

        public static void main(String[] args) {
            String s = "aaabbbcccccxyzzz";
            int result = countLenLongest(s, 0, s.length() - 1);
            System.out.println("Length of Longest Palindromic Subsequence: " + result);
        }
    }


