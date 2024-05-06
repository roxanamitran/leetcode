package binarySearch;

public class ValidPerfectSquare {
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(16));

    }

    public static boolean isPerfectSquare(int num) {
        int left = 1;
        int right = num;

        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (middle * middle == num) {
                return true;
            } else if (middle * middle < num) {
                left = middle + 1;
            } else if (middle * middle > num) {
                right = middle - 1;
            }
        }

        return false;
    }
}
