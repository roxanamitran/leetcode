package MasterOfTheCode_LeetCode;

public class HouseRobber {
    public static void main(String[] args) {
        System.out.println(rob(new int[]{1, 2, 3, 1}));
    }

    public static int rob(int[] nums) {
        int rob = 0;
        int noRob = 0;

        for (int i = 0; i < nums.length; i++) {
            int result = noRob + nums[i];
            int newResult = noRob> rob ? noRob : rob;
            rob = result;
            noRob = newResult;
        }

        return rob > noRob ? rob : noRob;
    }
}
