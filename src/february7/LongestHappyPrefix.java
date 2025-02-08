package february7;

//A happy prefix is a non-empty prefix that is also a suffix
public class LongestHappyPrefix {

  private static String happyPre(String str,int len) {
         if (len == 0) {
             System.out.println("No happy prefix");
                return "";
            }
      String prefix = str.substring(0, len);
      String suffix = str.substring(str.length() - len);
      if (prefix.equals(suffix)) {
                return prefix;
            }
            return happyPre(str, len - 1);
        }


    public static String longestHappy(String s) {
        return happyPre(s, s.length() - 1);
    }

   public static void main(String[] args) {
            String str = "dabababcdcd";
            System.out.println(longestHappy(str)); // Output: "abab"

        }


}
