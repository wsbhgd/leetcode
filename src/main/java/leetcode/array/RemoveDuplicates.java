package leetcode.array;

/**
 * leetcode 26
 *
 * @author mncool
 */
public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(removeDuplicates2(nums));
        for (int i = 0; i < nums.length; i++) {
            System.out.printf(nums[i] + ",");
        }
    }

    /**
     * 暴力方法，直接把不同的值swap到前面去
     */
    public static int removeDuplicates(int[] nums) {
        if (nums.length < 1) {
            return nums.length;
        }
        int count = 1;
        int tmp = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (i > 0 && nums[i] <= nums[i - 1]) {
                return count;
            }
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] > nums[i]) {
                    count++;
                    tmp = nums[j];
                    nums[j] = nums[i + 1];
                    nums[i + 1] = tmp;
                    break;
                }
            }
        }
        return count;
    }

    /**
     * 双指针法
     */
    public static int removeDuplicates2(int[] nums) {
        if (nums.length < 1) {
            return 0;
        }
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[count - 1]) {
                nums[count] = nums[i];
                count++;
            }
        }
        return count;

    }

}
