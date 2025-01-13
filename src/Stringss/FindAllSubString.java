package Stringss;

public class FindAllSubString {


        public static void findAllSubstrings(String str) {
            int n = str.length();


            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j <= n; j++) {
                    System.out.println(str.substring(i, j));
                }
            }
        }

        public static void main(String[] args) {
            String input = "abc";
            findAllSubstrings(input);
        }


}
