package january16;

public class longestSubstringwithoutrepetingChar {

    static int longestSubstring(String s) {
        int n = s.length();
        int charSize = 26;
        int result = 0;

        for (int i = 0; i < n; i++) {


            boolean[] visited = new boolean[charSize];

            for (int j = i; j < n; j++) {

                if (visited[s.charAt(j) - 'a'] == true) {
                    break;
                } else {
                    result = Math.max(result, j - i + 1);
                    visited[s.charAt(j) - 'a'] = true;
                }
            }
        }
        return result;


    }

    public static void main(String[] args) {
        String s = "greekgod";
            System.out.println(longestSubstring(s));
    }
}