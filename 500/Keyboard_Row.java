package MasterOfTheCode_LeetCode;

import java.util.Arrays;

public class Keyboard_Row {
    public static void main(String[] args) {
        String[] array = new String[]{"Hello","Alaska","Dad","Peace"};
        String[] result = findWords(array);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i] + " ");
        }

    }

    public static boolean isFromRow(String word, String row) {
        word = word.toLowerCase();

        for (int i = 0; i < word.length(); i++) {
            if (!row.contains(word.charAt(i) + "")) {
                return false;
            }
        }

        return true;
    }

    public static String[] findWords(String[] words) {
        String firstRow = "qwertyuiop";
        String secondRow = "asdfghjkl";
        String thirdRow = "zxcvbnm";
        String[] result = new String[words.length];
        int index = 0;

        for (int i = 0; i < words.length; i++) {
            if (isFromRow(words[i], firstRow) || isFromRow(words[i], secondRow) || isFromRow(words[i], thirdRow)) {
                result[index] = words[i];
                index++;
            }
        }

        return Arrays.copyOf(result, index);
    }
}
