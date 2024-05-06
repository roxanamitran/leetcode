package binarySearch;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = new int[]{4, 5, 6,7, 0, 1, 2};
        System.out.println(search(nums, 0));
    }

    public static int search(int[] nums, int target) {
        int firstLeft = 0;
        int firstRight = -1;
        int secondLeft = -1;
        int secondRight = nums.length - 1;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] < nums[i]) {
                firstRight = i - 1;
                secondLeft = i;
                break;
            }
        }

        if (firstRight != -1 && secondLeft != -1) {
            while (firstLeft <= firstRight) {
                int middle = (firstLeft + firstRight) / 2;
                if (nums[middle] == target) {
                    return middle;
                } else if (nums[middle] < target) {
                    firstLeft = middle + 1;
                } else if (nums[middle] > target) {
                    firstRight = middle - 1;
                }
            }

            while (secondLeft <= secondRight) {
                int middle = (secondLeft + secondRight) / 2;
                if (nums[middle] == target) {
                    return middle;
                } else if (nums[middle] < target) {
                    secondLeft = middle + 1;
                } else if (nums[middle] > target) {
                    secondRight = middle - 1;
                }
            }
        } else {
            while (firstLeft <= secondRight) {
                int middle = (firstLeft + secondRight) / 2;
                if (nums[middle] == target) {
                    return middle;
                } else if (nums[middle] < target) {
                    firstLeft = middle + 1;
                } else if (nums[middle] > target) {
                    secondRight = middle - 1;
                }
            }
        }

        return -1;
    }
}
