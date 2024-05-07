package Quiz35;

public class RotateArrayV2 {
    public static void main(String[] args) {
        int[] array = new int[]{1,2, 3};
        rotate(array, 4);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void rotate(int[] nums, int k) {
        if (k == 0 || nums.length == 1) {
            return;
        }

        if (nums.length == 2) {
            for (int i = 0; i < k; i++) {
                int aux = nums[0];
                nums[0] = nums[1];
                nums[1] = aux;
            }
            return;
        }
        int[] newArray = new int[nums.length];
        int index = 0;
        for (int i = nums.length - (k % nums.length); i < nums.length; i++) {
            newArray[index] = nums[i];
            index++;
        }
        for (int i = 0; i < nums.length - (k % nums.length); i++) {
            newArray[index] = nums[i];
            index++;
        }

        for (int i = 0; i < newArray.length; i++) {
            nums[i] = newArray[i];
        }
    }
}
