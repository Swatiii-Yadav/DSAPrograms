package january16;
public class AllDistinctSubstring {


     static boolean isSubstring(String[] str, String substr, int count) {
        for (int i = 0; i < count; i++) {
       if (str[i].equals(substr)) {
                return true;
            }
        }
        return false;
    }


     static int NoOfSubstring(String str) {
        if (str == null || str.length() == 0) {
            return 0;
        }

        int n = str.length();


        String[] result = new String[n * (n + 1) / 2];
        int count = 0;


        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                String sub = str.substring(i, j);


         if (!isSubstring(result, sub, count)) {
                    result[count] = sub;
                    count++;
                }
            }
        }


        return count;
    }

    public static void main(String[] args) {
        String str = "ssss";
        System.out.println(NoOfSubstring(str));
    }
}
