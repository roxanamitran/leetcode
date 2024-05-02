package Seturi_leetCode;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays {

    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> intersection = new HashSet<>();

        if (nums1.length < nums2.length) {
            for (int i = 0; i < nums1.length; i++) {
                for (int j = 0; j < nums2.length; j++) {
                    if (nums1[i] == nums2[j]) {
                        intersection.add(nums1[i]);
                    }
                }
            }
        } else {
            for (int i = 0; i < nums2.length; i++) {
                for (int j = 0; j < nums1.length; j++) {
                    if (nums2[i] == nums1[j]) {
                        intersection.add(nums2[i]);
                    }
                }
            }
        }

        Integer[] result = new Integer[intersection.size()];
        int j = 0;
        for(Integer i : intersection) {
            result[j++] = i;
        }

        int[] array = new int[result.length];
        int index = 0;

        for (int i = 0; i < result.length; i++) {
            array[index] = result[i];
            index++;
        }

        return array;
    }
}
