package stringQuestions;

import java.util.Scanner;

public class String1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println("Original String"+str);
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(10));
    }
}
