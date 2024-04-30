package MasterOfTheCode_LeetCode;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set_matrix_Zeroes {
    public static void main(String[] args) {
        int[][] matrix = new int[3][4];
        matrix[0][0] = 0;
        matrix[0][1] = 1;
        matrix[0][2] = 2;
        matrix[0][3] = 0;
        matrix[1][0] = 3;
        matrix[1][1] = 0;
        matrix[1][2] = 5;
        matrix[1][3] = 2;
        matrix[2][0] = 1;
        matrix[2][1] = 3;
        matrix[2][2] = 1;
        matrix[2][3] = 5;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        setZeroes(matrix);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void setZeroes(int[][] matrix) {
        Set<Integer> elementsOnRows = new HashSet<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    elementsOnRows.add(i);
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    for (int k = 0; k < matrix.length; k++) {
                        matrix[k][j] = 0;
                    }
                }
            }
        }

        Iterator<Integer> it = elementsOnRows.iterator();
        while (it.hasNext()) {
            int iterator = it.next();

            for (int i = 0; i < matrix[0].length; i++) {
                matrix[iterator][i] = 0;
            }
            it.remove();
        }
    }
}
