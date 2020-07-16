package leetcode.array;

/**
 * leetcode 1266
 *
 * @author mncool
 */
public class MinTimeToVisitAllPoints {

    public static void main(String[] args) {
        int[][] points = {{1, 1}, {3, 4}, {-1, 0}};
        System.out.println(minTimeToVisitAllPoints(points));
    }

    public static int minTimeToVisitAllPoints(int[][] points) {
        int res = 0;
        if (points.length <= 1) {
            return 0;
        }
        for (int i = 0; i < points.length - 1; i++) {
            int x1 = points[i][0];
            int y1 = points[i][1];
            int x2 = points[i + 1][0];
            int y2 = points[i + 1][1];
            res = res + Math.max(Math.abs(x1 - x2), Math.abs(y1 - y2));
        }
        return res;
    }
}
