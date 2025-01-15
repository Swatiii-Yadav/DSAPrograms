package january15;

public class reversEveryWordInString {
    static String reverseWords(String s) {
        s=s.trim();
        String[] str = s.split("\\s");

        String out = "";


        for (int i = str.length - 1; i > 0; i--) {
            out += str[i] + " ";
        }


        return out +str[0];
    }
    public static void main(String[] args) {
        String str="the sky is blue";
        System.out.println(reverseWords(str));
    }
}
