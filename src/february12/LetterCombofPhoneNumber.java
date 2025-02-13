package february12;

import java.util.Scanner;

public class LetterCombofPhoneNumber {

    String[] store = new String[256];
    int count = 0;

    public String[] findComb(String keys) {
        if (keys == null || keys.length() == 0) {
            return new String[0];
        }

        helper(new StringBuilder(), keys, 0);

        String[] result = new String[count];
        for (int i = 0; i < count; i++) {
            result[i] = store[i];
        }

        return result;
    }

    String[] KEYPAD = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    private void helper(StringBuilder curr, String digits, int index) {

        if (index == digits.length()) {
            store[count++] = curr.toString();
            return;
        }

        String letters = KEYPAD[digits.charAt(index) - '0'];

        for (char c : letters.toCharArray()) {
            curr.append(c);
            helper(curr, digits, index + 1);
            curr.deleteCharAt(curr.length() - 1);
        }
    }

    public static void main(String[] args) {
        LetterCombofPhoneNumber res = new LetterCombofPhoneNumber();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter keys ");
        String digits = sc.nextLine();
        String[] comb = res.findComb(digits);
        System.out.println(" result:");
        for (String combination : comb) {
            System.out.print(combination + " ");
        }
    }
}


