package Seturi_leetCode;

import java.util.HashSet;
import java.util.Set;

public class Single_Number_136 {
    
    public static int singleNumber(int[] nums) {
        Set<Integer> numbers = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (!numbers.add(nums[i])) {
                numbers.remove(nums[i]);
            } else {
                numbers.add(nums[i]);
            }
        }
        return (int)numbers.toArray()[0];
    }
}
