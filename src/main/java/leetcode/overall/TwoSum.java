package leetcode.overall;

import java.util.HashMap;
import java.util.Map;

/**
 * leetcode 1
 *
 * @author mncool
 */
public class TwoSum {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 9, 14};
        int target = 9;
        System.out.println(twoSum(nums, target));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer index = map.get(target - nums[i]);
            if (index != null) {
                res[0] = Math.min(index, i);
                res[1] = Math.max(index, i);
                return res;
            } else {
                map.put(nums[i], i);
            }
        }
        return res;
    }
}
