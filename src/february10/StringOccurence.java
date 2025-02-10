package february10;

public class StringOccurence {
    public static int countSub(String str, String sub, int i) {
        if (i > str.length() - sub.length()) {
            return 0;
        }

        if (str.startsWith(sub, i)) {
            return 1 + countSub(str, sub, i + 1);
        } else {
            return countSub(str, sub, i + 1);
        }
    }

    public static void main(String[] args) {
        String str = "aaabbcccaazzyy";
        String sub = "aa";
        int result = countSub(str, sub, 0);
        System.out.println("Occurrences of '" + sub + "': " + result);
    }
}
