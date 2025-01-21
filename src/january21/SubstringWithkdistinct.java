package january21;

import java.util.HashSet;

public class SubstringWithkdistinct {

        public static int countsubstring(String s, int K) {
            int count = 0;
            for (int i = 0; i < s.length(); i++) {
                for (int j = i + 1; j <= s.length(); j++) {
                    String substring = s.substring(i, j);
                    if (getDistinct(substring) == K) {
                        count++;
                    }
                }
            }

            return count;
        }


        public static int getDistinct(String substring) {
            HashSet<Character> ch = new HashSet<>();
            for (char c : substring.toCharArray()) {
                ch.add(c);
            }
            return ch.size();
        }
    public static void main(String[] args) {
        String str = "damncool";
        int K = 4;
        System.out.println( countsubstring(str, K));

    }


}
