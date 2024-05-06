package MasterOfTheCode_LeetCode;

public class SmallestLetterGreaterThanTarget744 {
    public char nextGreatestLetter(char[] letters, char target) {
        int left = 0;
        int right = letters.length - 1;
        int index = -1;

        while (left <= right) {
            int middle = (left + right) / 2;

            if (letters[middle] <= target) {
                left = middle + 1;
            } else {
                right = middle - 1;
                index = middle;
            }
        }

        if (index == -1) {
            return letters[0];
        }

        return letters[index];
    }
}
