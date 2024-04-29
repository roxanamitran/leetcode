package MergeSort;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] n1 = new int[]{1, 2, 3, 0, 0, 0};
        int[] n2 = new int[]{2, 5, 6};
        int[] result = merge(n1, 3, n2, 3);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

    }

    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        m--;
        n--;

        while (n >= 0) {
            if (m < 0 || nums1[m] < nums2[n]) {
                nums1[n + m + 1] = nums2[n];
                n--;
            } else {
                nums1[n + m + 1] = nums1[m];
                m--;
            }
        }

        return nums1;
    }
}
