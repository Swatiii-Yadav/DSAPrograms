package january15;

public class RotateStrtings {

    static boolean checkString(String s, String goal) {

        if (s.length() != goal.length()) {
            return false;


        }
        for (int i = 0; i < s.length(); i++) {


            String rotated = s.substring(i) + s.substring(0, i);
            if (rotated.equals(goal)) {
                return true;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        String str="abcde";
        String goal = "bcda";

        System.out.println(checkString(str,goal));
    }
}
