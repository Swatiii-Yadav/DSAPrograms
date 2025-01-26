package january26;

public class longestSubstringHavingAllCharactersasK {
    static boolean checkCharInString(String str,char x){
        char[] st=str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != x) {
                return false;
            }
        }
        return true;
    }
    static int findLengthOfSubstring(String str,char x){
        int len=0;
        String max="";
        for (int i=0;i<str.length()-1;i++) {
            for (int j=i+1;j<str.length()-1;j++ ) {
                String subStr=str.substring(i,j);
                if (checkCharInString(subStr,x)  && subStr.length()>max.length()){
                    len=subStr.length();
                    max=subStr;

                }
            }
        }
        System.out.println("palindromic sustring "+max);
        return len;
    }
    public static void main(String[] args) {
        String st="aaaaaabsscedf";
char x='a';
        System.out.println(findLengthOfSubstring(st,x));

    }
}
