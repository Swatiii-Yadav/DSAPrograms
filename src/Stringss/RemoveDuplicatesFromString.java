package Stringss;

public class RemoveDuplicatesFromString {
    public static String removeDuplicates(String str) {
            String result = "";

     for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
      if (!result.contains(String.valueOf(ch))) {
                    result+=ch;
                }
            }

            return result.toString();
        }

        public static void main(String[] args) {
            String str = "programming";
            String result = removeDuplicates(str);
            System.out.println(result);
        }


}
