package leetcode.array;

import java.util.HashMap;
import java.util.Map;

/**
 * leetcode 167
 *
 * @author mncool
 */
public class TwoSum167 {

    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        int[] res = twoSumUpdate(numbers, target);
        System.out.println(res[0] + ", " + res[1]);
    }

    public static int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = numbers.length - 1; i >= 0; i--) {

            Integer ans = map.get(target - numbers[i]);
            if (ans == null) {
                map.put(numbers[i], i + 1);
            } else {
                res[1] = ans;
                res[0] = i + 1;
            }
        }
        return res;
    }

    public static int[] twoSumUpdate(int[] numbers, int target) {
        int[] res = new int[2];
        int i = 0;
        int j = numbers.length - 1;
        while (i < j) {
            if (numbers[i] + numbers[j] > target) {
                j--;
            } else if (numbers[i] + numbers[j] < target) {
                i++;
            } else {
                res[0] = i + 1;
                res[1] = j + 1;
                return res;
            }
        }
        return res;
    }
}
