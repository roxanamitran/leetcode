package MasterOfTheCode_LeetCode;

import java.util.HashMap;
import java.util.Map;

public class IntersectionOfTwoArrays_350 {
    public static void main(String[] args) {
        int result[] = intersect(new int[]{1,2,2,1}, new int[]{2,2});
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

    }

    public static int[] intersect(int[] nums1, int[] nums2){
        Map<Integer, Integer> intersection = new HashMap<>();

        if (nums1.length < nums2.length) {
            for (int i = 0; i < nums1.length; i++) {
                for (int j = 0; j < nums2.length; j++) {
                    if (nums1[i] == nums2[j]) {
                        if (intersection.containsKey(nums1[i])) {
                            intersection.put(nums1[i], nums1[i] + 1);

                        } else {
                            intersection.put(nums1[i], 1);
                        }
                    }
                }
            }
        } else {
            for (int i = 0; i < nums2.length; i++) {
                for (int j = 0; j < nums1.length; j++) {
                    if (nums2[i] == nums1[j]) {
                        if (intersection.containsKey(nums2[i])) {
                            intersection.put(nums2[i], nums2[i] + 1);
                        } else {
                            intersection.put(nums2[i], 1);
                        }
                    }
                }
            }
        }

        int[] result = new int[nums1.length < nums2.length ? nums1.length : nums2.length];
        int index = 0;

        for (Map.Entry<Integer, Integer> entry : intersection.entrySet()) {
            int limit = entry.getValue();

            for (int i = 0; i < limit / 2; i++) {
                result[index] = limit;
                index++;
            }
        }

        return result;
    }
}
