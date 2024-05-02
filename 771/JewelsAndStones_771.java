package Seturi_leetCode;

import java.util.HashSet;
import java.util.Set;

public class JewelsAndStones_771 {
    public static void main(String[] args) {
        System.out.println(numJewelsInStones("aA", "aAAbbbb"));
        System.out.println(numJewelsInStones("z", "ZZ"));
    }

    public static int numJewelsInStones(String jewels, String stones) {
        Set<Character> s = new HashSet<>();
        int count = 0;
        for (int i = 0; i < stones.length(); i++) {
            if (jewels.contains(stones.charAt(i) + "")) {
                if (!s.add(stones.charAt(i))) {
                    count++;
                }
            }
        }

        return count + s.size();
    }
}
