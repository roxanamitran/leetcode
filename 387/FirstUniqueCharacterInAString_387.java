package MasterOfTheCode_LeetCode;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class FirstUniqueCharacterInAString_387 {
    public static void main(String[] args) {
        System.out.println(firstUniqChar("leetcode"));
        System.out.println(firstUniqChar("loveleetcode"));
        System.out.println(firstUniqChar("aabb"));
    }

    public static int firstUniqChar(String s) {
        Map<Character, Integer> structure = new TreeMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (structure.containsKey(s.charAt(i))) {
                structure.put(s.charAt(i), -1);
            } else {
                structure.put(s.charAt(i), i);
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if (structure.containsValue(i)) {
                return i;
            }
        }

        return  -1;

    }
}
