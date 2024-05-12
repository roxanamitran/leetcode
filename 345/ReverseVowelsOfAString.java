package MasterOfTheCode_LeetCode;

public class ReverseVowelsOfAString {
    public static void main(String[] args) {
        System.out.println(reverseVowels("leetcode"));
        System.out.println(reverseVowels("hello"));
        System.out.println(reverseVowels(".."));
    }

    public static String reverseVowels(String s) {
        StringBuilder reverse = new StringBuilder(s);
        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            while (i < s.length() && !isVowel(s.charAt(i))) {
                i++;
            }
            while (j >= 0 && !isVowel(s.charAt(j))) {
                j--;
            }

            if (i < s.length() && j >= 0) {
                reverse.setCharAt(i, s.charAt(j));
                reverse.setCharAt(j, s.charAt(i));

                i++;
                j--;
            }
        }

        return reverse.toString();
    }

    private static boolean isVowel(char c) {
        switch (c) {
            case 'a':
            case 'A':
            case 'e':
            case 'E':
            case 'i':
            case 'I':
            case 'o':
            case 'O':
            case 'u':
            case 'U':
                return true;
            default:
                return false;
        }
    }
}
