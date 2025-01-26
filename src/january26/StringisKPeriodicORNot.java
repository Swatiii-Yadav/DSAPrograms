package january26;

import java.util.Scanner;

public class StringisKPeriodicORNot {
    static  boolean checkKPeriodic(String str){
        Scanner sc=new Scanner(System.in);
        int n = str.length();
        System.out.println("K: ");
        int k=sc.nextInt();
        if (n % k != 0) {
          return false;
        }
        String res = str.substring(0, k);
        for (int i = k; i < n; i += k) {
            String curr = str.substring(i, i + k);
            if (!curr.equals(res)) {
                return false;
            }
        }

       return true;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str="abc";
        if (checkKPeriodic(str)){
            System.out.println("K Periodic");
        }
        else {
            System.out.println(" Not K Periodic");
        }

    }
}
