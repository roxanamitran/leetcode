package Seturi_leetCode;

import java.util.HashSet;
import java.util.Set;

public class DistributeCandies575 {
    public static void main(String[] args) {
        int[] candies1 = new int[]{1, 1, 2, 2, 3, 3};
        int[] candies2 = new int[]{1, 1, 2, 3};
        int[] candies = new int[]{6, 6, 6, 6};
        System.out.println(distributeCandies(candies1));
        System.out.println(distributeCandies(candies2));
        System.out.println(distributeCandies(candies));
    }

    public static int distributeCandies(int[] candyType) {
        int maxOfCandiesToEat = candyType.length / 2;
        Set<Integer> candies = new HashSet<>();

        for (int i = 0; i < candyType.length; i++) {
            candies.add(candyType[i]);
        }

        return maxOfCandiesToEat < candies.size() ? maxOfCandiesToEat : candies.size();
    }
}
