package MasterOfTheCode_LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Pascal_sTriangle {
    public static List<List<Integer>> generate(int numRows) {
        List<Integer> oneRow = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            if (i == 0) {
                oneRow.add(1);
                result.add(oneRow);
                oneRow = new ArrayList<>();

//            } else if (i == 1) {
//                oneRow.add(1);
//                oneRow.add(1);
//                result.add(oneRow);
//                oneRow.remove(oneRow.size() - 1);
//                oneRow.remove(oneRow.size() - 1);

            } else {
                oneRow.add(1);
                for (int j = 0; j < result.get(result.size() - 1).size() - 1; j++) {
                    oneRow.add(result.get(result.size() - 1).get(j) + result.get(result.size() - 1).get(j + 1));
                }
                oneRow.add(1);
                result.add(oneRow);
                oneRow = new ArrayList<>();
            }
        }

        return result;
    }

    public static void main(String[] args) {
        List<List<Integer>> result = generate(5);

        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i) + " ");
        }
    }
}
