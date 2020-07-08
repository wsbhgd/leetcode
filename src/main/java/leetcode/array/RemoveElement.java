package leetcode.array;

/**
 * leetcode 27
 * @author mncool
 */
public class RemoveElement {

    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(removeElement(nums, 1));
        for (int i = 0; i < nums.length; i++) {
            System.out.printf(nums[i] + ",");
        }
    }

    public static int removeElement(int[] nums, int val) {
        if (nums.length < 1) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[count++] = nums[i];
            }
        }
        return count;

    }
}
