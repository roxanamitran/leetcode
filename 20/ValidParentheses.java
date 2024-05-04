package recapitulare_colectii;

import java.util.ArrayDeque;
import java.util.Deque;

public class ValidParentheses {
    public static void main(String[] args) {

        String s = "()[]{}";
        System.out.println(isValid(s));

    }

    public static boolean isValid(String str) {
        Deque<Character> string = new ArrayDeque<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(' || str.charAt(i) == '[' || str.charAt(i) == '{') {
                string.push(str.charAt(i));
            } else if (!string.isEmpty() && (string.peek() == '(' && str.charAt(i) == ')')
                                      || (string.peek() == '{' && str.charAt(i) == '}')
                                      || (string.peek() == '[' && str.charAt(i) == ']')) {
                string.pop();
            } else {
                string.push(str.charAt(i));
            }
        }

        return string.isEmpty();
    }
}
