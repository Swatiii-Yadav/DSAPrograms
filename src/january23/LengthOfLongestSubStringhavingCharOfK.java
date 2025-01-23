package january23;

public class LengthOfLongestSubStringhavingCharOfK {
    public static void main(String[] args) {
        String str = "abcd11111aabc";
        char k = '1';
        int count = 0, maxx = 0,start=-1;
        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == k) {

                count++;
                maxx = Math.max(maxx, count);
                start=i-count+1;//abcd11111aabc -->0123456789.10.11.12 yaha pr 1 ki last insdex 8 hai iski start index
                //find karne ke liye count se minus kar denge
            } else {

                count = 0;

            }
        }
        maxx = Math.max(maxx, count);
        System.out.println(maxx);
        //aslo print the substring
        if (maxx > 0) {
            System.out.println(str.substring(start,start+maxx));

        }
        else {
            System.out.println("Not find anything");
        }
    }
}
