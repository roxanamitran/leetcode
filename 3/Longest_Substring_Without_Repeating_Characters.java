package MasterOfTheCode_LeetCode;

import java.util.HashMap;
import java.util.Map;

public class Longest_Substring_Without_Repeating_Characters {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
        System.out.println(lengthOfLongestSubstring("bbbbb"));
        System.out.println(lengthOfLongestSubstring("dvdf"));

    }

    public static int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> charsFromS = new HashMap<>();
        int n = s.length();
        int left = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (!charsFromS.containsKey(s.charAt(i)) || charsFromS.get(s.charAt(i))  < left) {
                charsFromS.put(s.charAt(i), i);
                max = Math.max(max, i - left + 1);
            } else {
                left = charsFromS.get(s.charAt(i)) + 1 ;
                charsFromS.put(s.charAt(i), i);
            }
        }

        return max;
    }
}
