package february2;

public class PalindromicPermutation {

    public static void permute(String str,int start,int end) {
        if (start==end){
            if (isPalindrome(str)){
            System.out.println(str);}
            return;
        }
        for (int i=start;i<=end;i++){
            str=swap(str,start,i);
            permute(str,start+1,end);
            str=swap(str,start,i);
        }
    }

    static String swap(String str,int start,int end){
        char[] c=str.toCharArray();
        char temp=c[start];
        c[start]=c[end];
        c[end]=temp;
        return new String(c);
    }


    public static boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "ABCBA";
        permute(str,0 ,str.length()-1);

    }


}
