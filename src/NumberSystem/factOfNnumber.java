package NumberSystem;

public class factOfNnumber {
    static int findFact(int n){
        int fact=1;
        for (int i=1;i<=n;i++){
            fact*=i;
        }
        return fact;
    }
    public static void main(String[] args) {
        System.out.println(findFact(5));
    }
}
