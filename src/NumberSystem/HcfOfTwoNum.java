package NumberSystem;

import java.util.Scanner;

public class HcfOfTwoNum {
    static int findHcf(int a,int b){
        int minNum=Math.min(a, b);
        while(minNum>0){
            if (a%minNum==0 && b%minNum==0){
                break;
            }
            minNum--;
        }
        return minNum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter values of a and b");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(findHcf(a,b));
    }
}
