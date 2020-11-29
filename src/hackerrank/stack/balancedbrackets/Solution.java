package hackerrank.stack.balancedbrackets;

import java.io.*;
import java.util.*;

public class Solution {

    // Complete the isBalanced function below.
    static String isBalanced(String s) {
        Stack<Character> stack = new Stack<>();
        try {
            for (int i = 0; i < s.length(); i++) {
                Character c = s.charAt(i);
                if (c.charValue() == '}') {
                    if (stack.pop().charValue() != '{') {
                        return "NO";
                    }
                } else if (c.charValue() == ')') {
                    if (stack.pop().charValue() != '(') {
                        return "NO";
                    }
                } else if (c.charValue() == ']') {
                    if (stack.pop().charValue() != '[') {
                        return "NO";
                    }
                } else {
                    stack.push(c);
                }
            }
        } catch (EmptyStackException e) {
            return "NO";
        }
        if (stack.isEmpty()) {
            return "YES";
        } else {
            return "NO";
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String s = scanner.nextLine();
            String result = isBalanced(s);
            System.out.println(result);
        }
        scanner.close();
    }
}
