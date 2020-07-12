package leetcode.array;

/**
 * @author mncool
 */
public class SearchInsert {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 5;
        System.out.println(searchInsert(nums, target));
    }

    public static int searchInsert(int[] nums, int target) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return target > nums[0] ? 1 : 0;
        }
        int i = 0;
        int j = nums.length - 1;

        while (i < j) {
            int middle = (i + j) / 2;
            if (nums[middle] == target) {
                return middle;
            } else if (nums[middle] > target) {
                j = middle - 1;
            } else {
                i = middle + 1;
            }
        }
        if (target < nums[i]) {
            return i;
        }
        if (target > nums[j]) {
            return j + 1;
        }
        return i;
    }
}
