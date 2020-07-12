package leetcode.array;

/**
 * leetcode 1299
 *
 * @author mncool
 */
public class ReplaceMaxElement {
    public static void main(String[] args) {
        int[] arr = {17, 18, 5, 4, 6, 1};
        int[] res = replaceElements(arr);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + ",");
        }
    }

    public static int[] replaceElements(int[] arr) {
        int[] res = new int[arr.length];
        if (arr.length == 0) {
            return res;
        }
        res[res.length - 1] = -1;
        for (int j = arr.length - 1; j > 0; j--) {
            res[j - 1] = Math.max(res[j], arr[j]);
        }
        return res;
    }
}
