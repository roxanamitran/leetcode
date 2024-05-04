package recapitulare_colectii;

import java.util.ArrayDeque;
import java.util.Deque;

public class BaseballGame {
    public static void main(String[] args) {
        String[] operations = new String[]{"5", "2", "C", "D", "+"};
        System.out.println(calPoints(operations));

    }

    public static int calPoints(String[] operations) {
        Deque<Integer> score = new ArrayDeque<>();
        int sum = 0;
        for (int i = 0; i < operations.length; i++) {
            String operation = operations[i];

            switch (operation) {
                case "+":
                    int lastElem = score.pop();
                    int result = score.peek() + lastElem;
                    score.push(lastElem);
                    score.push(result);
                    break;
                case "D":
                    score.push(score.peek() * 2);
                    break;
                case "C":
                    score.pop();
                    break;
                default:
                    score.push(Integer.valueOf(operation));
                    break;
            }
        }

        while (!score.isEmpty()) {
            sum += score.pop();
        }

        return sum;
    }
}
