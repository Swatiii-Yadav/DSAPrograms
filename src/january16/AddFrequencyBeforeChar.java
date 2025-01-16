package january16;

public class AddFrequencyBeforeChar {
    static String AddFreq(String str) {
        StringBuilder res = new StringBuilder();
        int i = 0;
        String output;
        while (i < str.length()) {
            char c = str.charAt(i);
            int count = 0;
            while (i < str.length() && str.charAt(i) == c && count < 9) {
                count++;
                i++;

            }

            res.append(count).append(c);
        }
        return res.toString();
    }
    public static void main(String[] args) {
        String str="aaabbcd";
        System.out.println(AddFreq(str));

    }
}
