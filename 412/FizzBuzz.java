package MasterOfTheCode_LeetCode;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            String element = "";
            if (i % 5 == 0 && i % 3 == 0) {
                element = "FizzBuzz";
            } else if (i % 3 == 0) {
                element = "Fizz";
            } else if (i % 5 == 0) {
                element = "Buzz";
            } else {
                element = Integer.toString(i);
            }

            result.add(element);
        }

        return result;
    }

    public static void main(String[] args) {
        List<String> result = fizzBuzz(15);
        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i) + " ");
        }
    }
}
