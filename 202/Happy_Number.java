package MasterOfTheCode_LeetCode;

public class Happy_Number {
    public static void main(String[] args) {
        System.out.println(isHappy(421));
    }

    public static boolean isHappy(int n) {
        int sum = 0;

        while (n != 0) {
            int lastDigit = n % 10;
            sum += lastDigit * lastDigit;
            n /= 10;

            if (n == 0 && sum == 20) {
                return false;
            }

            if (sum > 1 && n == 0) {
                n = sum;
                sum = 0;
            }
        }

        return sum == 1;
    }
}
