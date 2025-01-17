package january17;
import java.util.*;
public class countFreqOfCharInString {

        public static String Sortstring(String str) {
            char c[] = str.toCharArray();
            Arrays.sort(c);
            return new String(c);
        }

        public static void Countfrequency(String str) {
            str = Sortstring(str);
            char ch = str.charAt(0);
            int count = 1;
            for (int i = 1; i < str.length(); i++) {
                if (str.charAt(i) == ch)
                    count++;
                else {
                    System.out.print(ch);
                    System.out.print(count + " ");
                    ch = str.charAt(i);
                    count = 1;
                }
            }
            System.out.print(ch);
            System.out.print(count + " ");
        }

        public static void main(String args[]) {
            String str = "swatii";
            Countfrequency(str);
    }
}
