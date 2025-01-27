package january27;

public class CountSubstringsWithDistinctChar {


     static int countDistinct(String s) {
        int count=0;
for (int i=0;i<s.length();i++){
    for (int j=i+1;j<s.length();j++){
        String sub=s.substring(i,j);
        if (distinct(sub)){
            count++;
            System.out.println(sub);
        }
    }

}
        return count;
    }

    static boolean distinct(String str){
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String S = "abca";
        System.out.println("No of Distict SubString "+countDistinct(S));
    }

}
