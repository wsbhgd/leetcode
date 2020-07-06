package leetcode.array;

/**
 * @author mncool
 */
public class HeightChecker {

    public static void main(String[] args) {
        int[] heights = {1, 1, 4, 2, 1, 3};
        System.out.println(heightChecker(heights));
    }

    public static int heightChecker(int[] heights) {
        if (heights.length <= 1) {
            return 0;
        }
        int[] sortedElements = new int[101];
        for (int i = 0; i < heights.length; i++) {
            sortedElements[heights[i]]++;
        }
        int count = 0;
        int start = 0;
        for (int i = 0; i < sortedElements.length; i++) {
            while (sortedElements[i]-- > 0) {
                if (heights[start] != i) {
                    count++;
                }
                start++;
            }
        }
        return count;
    }
}
