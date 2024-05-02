package MasterOfTheCode_LeetCode;

import java.util.HashMap;
import java.util.Map;

public class Two_Sum_1 {
    public static void main(String[] args) {
        int[] nums = new int[]{3, 2, 4};
        int[] result = twoSum(nums, 6);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>(nums.length);
        int n = nums.length;
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < n; i++) {
            int differenceBetweenTargetAndNumber = target - nums[i];
            if (map.containsKey(differenceBetweenTargetAndNumber) && map.get(differenceBetweenTargetAndNumber) != i) {
                return new int[]{i, map.get(differenceBetweenTargetAndNumber)};
            }
        }

        return new int[]{};
    }
}
