package january16;

public class firstOccuranceOfSubstring {


        public static int strStr(String s1, String s2) {
            if (s2 == null || s2.isEmpty())
            {
                return 0;
            }
            if (s1 == null || s1.length() < s2.length()){
                return -1;
            }

            int n = s1.length();
            int m = s2.length();

            for (int i = 0; i <= n - m; i++) {

                if (s1.substring(i, i + m).equals(s2)) {
                    return i;
                }
            }

            return -1;
        }

        public static void main(String[] args) {
            String s1 = "jello";
            String s2 = "ll";

            System.out.println(strStr(s1, s2));
        }
    }


