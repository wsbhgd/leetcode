package leetcode.array;

/**
 * @author mncool
 */
public class MissingNumber {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(missingNumber(nums));
    }

    public static int missingNumber(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return 1 - nums[0];
        }
        int low = 0;
        int high = nums.length;
        while (low < high) {
            int middle = (low + high) / 2;
            if (nums[middle] > middle) {
                high = middle;
            } else {
                low = middle + 1;
            }
        }
        return low;
    }
}
