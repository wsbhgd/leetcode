package leetcode.array;

/**
 * @author mncool
 */
public class FindLengthOfLCIS {


    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 4, 6};
        System.out.println(findLengthOfLCIS(nums));

    }

    public static int findLengthOfLCIS(int[] nums) {

        int count = 1;
        int res = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= nums[i - 1]) {
                count = 0;
            }
            count++;
            res = Math.max(count, res);

        }
        return res;
    }
}
