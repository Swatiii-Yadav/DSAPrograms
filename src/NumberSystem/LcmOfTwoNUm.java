package NumberSystem;

import java.util.Scanner;

public class LcmOfTwoNUm {
    static int findHcf(int a,int b){
        int minNum=Math.min(a,b);
        while (minNum>0){
            if (a%minNum==0 && b%minNum==0){
                break;
            }
            minNum--;
        }
        return minNum;
    }
    static int findLcm(int a,int b){
        int result=a/findHcf(a,b);
        return result*b;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(findLcm(a,b));
    }
}
