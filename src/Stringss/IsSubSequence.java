package Stringss;

public class IsSubSequence {
    public static boolean isSubsequence(String s, String t) {
        int i=0,j=0;

        while (s.length() >i &&  t.length() > j ) {

            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        if (i==s.length()){
            return  true;
        }
        return false;
    }
    public static void main(String[] args) {
        String str1="abc";
                String  str2 = "ahbgdc";
        System.out.println(isSubsequence(str1,str2));
    }
}
