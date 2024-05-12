package MasterOfTheCode_LeetCode;

import java.util.HashMap;
import java.util.Map;

public class LongestPalindrome {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("abccccddeee"));
    }

    public static int longestPalindrome(String s) {
        Map<Character, Integer> letters = new HashMap();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (letters.containsKey(c)) {
                letters.put(c, letters.get(c) + 1);
            } else {
                letters.put(c, 1);
            }
        }

        for (Map.Entry<Character, Integer> entry: letters.entrySet()) {
            count += entry.getValue() - entry.getValue() % 2;
        }

        return count < s.length() ? count + 1 : count;
    }
}
