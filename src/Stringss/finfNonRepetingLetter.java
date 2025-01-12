package Stringss;

public class finfNonRepetingLetter {
    static int firstNonRepeating(String str) {
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (i != j && str.charAt(i) == str.charAt(j)) {
                    count = 1;
                    break;
                }
            }if (count == 0) {
                return i;
            }
        }

        return -1;

}

    public static void main(String[] args) {
        String str = "engineer";
        int index = firstNonRepeating(str);
        System.out.println( index == -1 ? "not found" : "character found at " + str.charAt(index));

    }
}
