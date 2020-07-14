package leetcode.array;

import java.util.HashMap;
import java.util.Map;

/**
 * leetcode1089
 *
 * @author mncool
 */
public class DuplicateZeros {

    public static void main(String[] args) {
        int[] nums = {1, 0, 2, 3, 0, 4, 5, 0};
        duplicateZeros(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i] + ",");
        }
    }

    public static void duplicateZeros(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        if (arr.length <= 1) {
            return;
        }
        if (arr[0] == 0) {
            map.put(0, 1);
        }
        for (int i = 1; i < arr.length; i++) {
            Integer count = map.get(i - 1);
            if (count == null) {
                count = 0;
            }
            map.put(i, arr[i] == 0 ? count + 1 : count);
        }
        Map<Integer, Integer> map2 = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            Integer value = map.get(i);
            if (value == null) {
                value = 0;
            }
            map2.put(i + value, arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            Integer value = map2.get(i);
            if (value == null) {
                value = 0;
            }
            arr[i] = value;
        }

    }
}
