package january15;

public class RemoveOccuranceofCharInString {
    static void removeChar(String str,char x){
        StringBuilder res=new StringBuilder();
        char[] chars=str.toCharArray();

        for (int i=0;i<chars.length;i++){
            if (chars[i]!=x){
                res.append(chars[i]);
            }
        }
        System.out.println(res.toString());
    }
    public static void main(String[] args) {
        removeChar("aabaac",'c');
    }

}

