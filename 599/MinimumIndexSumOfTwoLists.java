package MasterOfTheCode_LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MinimumIndexSumOfTwoLists {
    public static void main(String[] args) {
        String[] result = findRestaurant(new String[]{"Shogun","Tapioca Express","Burger King","KFC"}, new String[]{"Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"});
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map = new HashMap<>();
        int min = Integer.MAX_VALUE;
        String[] result = new String[list1.length > list2.length ? list1.length : list2.length];
        int index = 0;
        if (list1.length < list2.length) {
            for (int i = 0; i < list1.length; i++) {
                for (int j = 0; j < list2.length; j++) {
                    if (list1[i].compareTo(list2[j]) == 0) {
                        map.put(list1[i], i + j);
                        if((i + j) < min) {
                            min = i + j;
                        }
                    }
                }
            }
        } else {
            for (int i = 0; i < list2.length; i++) {
                for (int j = 0; j < list1.length; j++) {
                    if (list2[i].compareTo(list1[j]) == 0) {
                        map.put(list2[i], i + j);
                        if ((i + j) < min) {
                            min = i + j;
                        }
                    }
                }
            }
        }

        for (Map.Entry<String, Integer> entry: map.entrySet()){
            if (entry.getValue() == min) {
                result[index] = entry.getKey();
                index++;
            }
        }

        return Arrays.copyOf(result, index);
    }
}
