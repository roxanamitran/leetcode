package MasterOfTheCode_LeetCode;

public class FindFirstAndLastPositionOfElementInSortedArray {
    public int[] searchRange(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int middle = (left + right) / 2;

            if (target == nums[middle]) {
                int start = middle;
                int end = middle;

                while (start - 1 >= 0 && nums[start - 1] == target) {
                    start--;
                }

                while (end + 1 < nums.length && nums[end + 1] == target) {
                    end++;
                }

                return new int[]{start, end};
            } else if (target < nums[middle]) {
                right = middle - 1;
            } else if (target > nums[middle]) {
                left = middle + 1;
            }
        }

        return new int[]{-1, -1};
    }
}
