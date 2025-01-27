package january27;

public class SubstringsWithNumericValueGreaterThanX {
    static void countSubString(String str,int x){
        int count=0;
        String res="";
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <=str.length(); j++) {
                String sub = str.substring(i, j);
                int subValue=Integer.parseInt(sub);
                if (subValue>x){
                    count++;
                    System.out.println("the values which are greater than X are "+subValue);
                }
            }
        }
        System.out.println("total number greater than "+x+" is "+count);


    }
    public static void main(String[] args) {
        String str="1234";
        int x=24;
        countSubString(str,x);
    }
}
