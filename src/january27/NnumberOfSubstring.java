package january27;
//findand and count  all substring whose size are same as n
public class NnumberOfSubstring {
    static void countSubstring(String str, int n) {
        int count = 0;
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                String sub = str.substring(i, j);
                if (sub.length() == n) {
                    count++;
                    System.out.println("Substrings are " + sub);
                }
            }
        }
        System.out.println("total number SubString of size  " + n + " is " + count);


    }

    public static void main(String[] args) {
        String str = "abbcdjriu";
        int n = 3;
        countSubstring(str, n);
    }
}
