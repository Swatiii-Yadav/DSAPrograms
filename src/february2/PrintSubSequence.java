package february2;

public class PrintSubSequence {
    public static void main(String[] args) {
        subSequences("", "xyz");
    }

    static void subSequences(String res, String str) {
        if (str.isEmpty()) {
            System.out.println(res);
            return;
        }
        char c = str.charAt(0);
        subSequences(res, str.substring(1));
        subSequences(res + c, str.substring(1));
    }
}
