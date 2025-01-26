package january26;

public class ShortestPalindromicSubstring {
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
        String min="";
        for (int i=0;i<str.length()-1;i++) {
            for (int j=i+1;j<str.length()-1;j++ ) {
                String subStr=str.substring(i,j);
                if (checkPalidrome(subStr) ) {

                    if (min.equals("") || subStr.length() < min.length()) {
                        min = subStr;
                    }


                }

            }
        }
        if (min==null){
            System.out.println("No Palindromic substring");
        }
        else
            System.out.println("Palidromic substing :"+min);
        return min.length();
    }

    public static void main(String[] args) {
        String st="aaabsscedf";

        System.out.println(findLengthOfSubstring(st));

    }

}
