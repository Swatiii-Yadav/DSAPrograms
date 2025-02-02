package february2;

public class GenerateAllUniquePermutation {

    public static void   permutation(String str,int start,int end) {
        if (start==end){
            System.out.println(str);

        }

        for (int i=start;i<=end;i++){
            if (i != start && str.charAt(i) == str.charAt(start)) {
                continue;
            }
            str=swap(str,start,i);
         permutation(str,start+1,end);
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

    public static void main(String[] args) {
        String str = "AABBD";
       permutation(str,0 ,str.length()-1);

    }
}
