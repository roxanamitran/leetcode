package MasterOfTheCode_LeetCode;

import java.util.HashMap;
import java.util.Map;

public class Valid_Anagram_242 {
    public static void main(String[] args) {

        String a = "aacc";
        String b = "ccac";
        System.out.println(isAnagram(a, b));
    }

    public static boolean isAnagram(String s, String t) {
        s = s.toLowerCase();
        t = t.toLowerCase();
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> charsFromS = new HashMap<>(s.length());
        HashMap<Character, Integer> charsFromT = new HashMap<>(t.length());

        for (int i = 0; i < s.length(); i++) {
            if (charsFromS.containsKey(s.charAt(i))) {
                charsFromS.put(s.charAt(i), charsFromS.get(s.charAt(i)) + 1);
            } else {
                charsFromS.put(s.charAt(i), 1);
            }
        }

        for (int i = 0; i < t.length(); i++) {
            if (charsFromT.containsKey(t.charAt(i))) {
                charsFromT.put(t.charAt(i), charsFromT.get(t.charAt(i)) + 1);
            } else {
                charsFromT.put(t.charAt(i), 1);
            }
        }

        if (charsFromS.size() != charsFromT.size()) {
            return false;
        } else {
            for (Map.Entry<Character, Integer> entry : charsFromS.entrySet()) {
                Integer elem = charsFromT.get(entry.getKey());
                if (elem == null) {
                    return false;
                }
                if (entry.getValue() != elem) {
                    return false;
                }
            }

            return  true;
        }
    }
}
