package leetcode.array;

/**
 * @author mncool
 */
public class MergeSortedArray {

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        merge(nums1, m, nums2, n);
        for (int i = 0; i < nums1.length; i++) {
            System.out.printf(nums1[i] + ",");
        }
    }


    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < n; i++) {
            nums1[m + i] = nums2[i];
        }
        quickSort(nums1, 0, m + n - 1);

    }

    public static void quickSort(int[] num, int left, int right) {
        if (left > right) {
            return;
        }
        int i = left;
        int j = right;
        int index = num[left];
        while (i < j) {
            while (num[j] >= index && i < j) {
                j--;
            }
            while (num[i] <= index && i < j) {
                i++;
            }
            if (i < j) {
                int tmp = num[j];
                num[j] = num[i];
                num[i] = tmp;
            }
        }
        num[left] = num[i];
        num[i] = index;
        quickSort(num, left, j - 1);
        quickSort(num, j + 1, right);
    }
}
