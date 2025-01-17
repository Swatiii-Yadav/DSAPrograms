package january17;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class findallanagram {


    public static List<Integer> findAnagrams(String s1, String s2) {
            List<Integer> result = new ArrayList<>();


            if (s1.length() < s2.length()) {
                return result;
            }


            for (int i = 0; i <= s1.length() - s2.length(); i++) {

                String substring = s1.substring(i, i + s2.length());


                if (isAnagram(substring, s2)) {
                    result.add(i);
                }
            }

            return result;
        }


        private static boolean isAnagram(String str1, String str2) {

            if (str1.length() != str2.length()) {
                return false;
            }


            char[] arr1 = str1.toCharArray();
            char[] arr2 = str2.toCharArray();

            Arrays.sort(arr1);
            Arrays.sort(arr2);


            return Arrays.equals(arr1, arr2);
        }
    public static void main(String[] args) {
        String s1 = "cbaebabacd";
        String s2 = "abc";

        List<Integer> result = findAnagrams(s1, s2);
        System.out.println(result);
    }
}

