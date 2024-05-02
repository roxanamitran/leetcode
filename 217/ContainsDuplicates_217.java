package Seturi_leetCode;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicates_217 {
    public static void main(String[] args) {
        System.out.println(containsDuplicates(new int[]{1, 2, 3, 1}));
        System.out.println(containsDuplicates(new int[]{1, 2, 3, 4}));
        System.out.println(containsDuplicates(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2}));
    }

    public static boolean containsDuplicates(int[] nums) {
        int length = nums.length;
        Set<Integer> numbers = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            numbers.add(nums[i]);
        }

        return length > numbers.size();
    }
}
