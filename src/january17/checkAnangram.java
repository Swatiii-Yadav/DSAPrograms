package january17;
import  java.util.*;
public class checkAnangram {

        public static void main(String[] args) {
            String str1 = "listen";
            String str2 = "silent";


            if (areAnagrams(str1, str2)) {
                System.out.println(str1 + "and" + str2 + " are anagrams.");
            } else {
                System.out.println(str1 + "and" + str2 + " are not anagrams.");
            }
        }

        public static boolean areAnagrams(String str1, String str2) {

            if (str1.length() != str2.length()) {
                return false;
            }


            char[] ch1 = str1.toCharArray();
            char[] ch2 = str2.toCharArray();


            Arrays.sort(ch1);
            Arrays.sort(ch2);

            return Arrays.equals(ch1, ch2);
        }
    }


