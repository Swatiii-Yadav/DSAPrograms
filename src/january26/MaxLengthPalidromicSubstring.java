package january26;

public class MaxLengthPalidromicSubstring {
    static boolean checkPalidrome(String str){
        char[] st=str.toCharArray();
        int low=0;int high=str.length()-1;
        while (low<=high){
            if (str.charAt(low) != str.charAt(high)) {

                return false;
            }
            low++;
            high--;
        }
        return true;
    }
    static int findLengthOfSubstring(String str){
        StringBuilder s1=new StringBuilder();
        int len=0;
        String max="";
        for (int i=0;i<str.length()-1;i++) {
            for (int j=i+1;j<str.length()-1;j++ ) {
                String subStr=str.substring(i,j);
            if (checkPalidrome(subStr)  && subStr.length()>max.length()){
                len=subStr.length();
                max=subStr;

            }
        }
    }
        System.out.println("palindromic sustring "+max);
        return len;
    }
    public static void main(String[] args) {
String st="aaabsscedf";

        System.out.println(findLengthOfSubstring(st));

    }
}
