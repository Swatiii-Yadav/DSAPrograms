package january15;

public class LongestCommonPrefix {
    public static String findPrefix(String[] str) {
        if (str == null || str.length == 0) {
            return "";
        }

        String result = str[0];
        int prefixLen = result.length();

        for (int i = 1; i < str.length; i++) {
            String s = str[i];
     while (prefixLen > s.length() )
         if(!result.equals(s.substring(0, prefixLen))) {
       prefixLen--;
                if (prefixLen == 0) {
                    return "";
                }

                result = result.substring(0, prefixLen);
            }
        }
        return result;


    }
    public static void main(String[] args) {
String []str={"Flower","Flo","Flight"};
        System.out.println(findPrefix(str));
    }
}
