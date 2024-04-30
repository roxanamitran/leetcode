package general;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
        System.out.println(longestCommonPrefix(new String[]{"dog", "car", "racecar"}));

    }

    public static String longestCommonPrefix(String[] strs) {
        String longestPrefix = "";
        for (int i = 0; i < strs[0].length(); i++) {
            boolean shouldBeAdded = true;
            for (int j = 1; j < strs.length; j++) {
                if (i > strs[j].length() - 1) {
                    return longestPrefix;
                }
                if (strs[j].charAt(i) != strs[0].charAt(i)) {
                    shouldBeAdded = false;
                }
            }
            if (shouldBeAdded) {
                longestPrefix += strs[0].charAt(i);
            } else {
                return longestPrefix;
            }
        }
        return longestPrefix.toLowerCase();
    }
}
