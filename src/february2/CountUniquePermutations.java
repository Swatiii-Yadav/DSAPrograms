package february2;

public class CountUniquePermutations {
    public static int  permutatioCount(String str,int start,int end) {
        if (start==end){

            return 1;
        }
        int count=0;
        for (int i=start;i<=end;i++){
            if (i != start && str.charAt(i) == str.charAt(start)) {
                continue;
            }
            str=swap(str,start,i);
            count+=permutatioCount(str,start+1,end);
            str=swap(str,start,i);
        }
        return count;
    }

    static String swap(String str,int start,int end){
        char[] c=str.toCharArray();
        char temp=c[start];
        c[start]=c[end];
        c[end]=temp;
        return new String(c);
    }

    public static void main(String[] args) {
        String str = "AAB";
        System.out.println(permutatioCount(str,0 ,str.length()-1));

    }
}
