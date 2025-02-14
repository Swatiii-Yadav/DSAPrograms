package february13;

import java.util.Scanner;

public class GenerateParentheses {
    public static void generate(int openP, int closeP, int max, String current) {
        if (current.length() == max * 2) {
            System.out.println(current);
            return;
        }
        if (openP < max) {
            generate(openP + 1, closeP, max, current + "(");
        }
        if (closeP < openP) {
            generate(openP,closeP + 1, max, current + ")");
        }
    }

    // Main method to test the function
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        generate(0, 0, n, "");
    }
}

