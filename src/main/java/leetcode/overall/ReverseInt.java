package leetcode.overall;

/**
 * leetcode 7
 *
 * @author mncool
 */
public class ReverseInt {

    public static void main(String[] args) {
        System.out.println(reverse(-123));
        System.out.println(reverse(-1234));
        System.out.println(reverse(0));
        System.out.println(reverse(194));
        System.out.println(reverse(120));
        System.out.println(reverse(1534236469));
    }

    public static int reverse(int x) {

        long res = 0;
        while (x != 0) {
            int tail = x % 10;
            res = res * 10 + tail;
            x = (x - tail) / 10;
            if (res > Integer.MAX_VALUE || res < Integer.MIN_VALUE) {
                return 0;
            }
        }
        return (int)res;
    }
}
