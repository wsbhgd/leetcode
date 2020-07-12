package leetcode.array;

import java.util.ArrayList;
import java.util.List;

/**
 * leetcode 118
 * @author mncool
 */
public class YHTriangle {

    public static void main(String[] args) {
        int numRows = 4;
        System.out.println(generate(numRows));
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        if (numRows == 0) {
            return res;
        }
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            row.add(1);
            List<Integer> lastRow = i > 0 ? res.get(i - 1) : row;
            for (int j = 1; j <= i; j++) {
                if (j <= i / 2) {
                    if (j >= lastRow.size()) {
                        row.add(1);
                    } else {
                        row.add(lastRow.get(j - 1) + lastRow.get(j));
                    }
                } else {
                    row.add(row.get(i - row.size()));
                }
            }
            res.add(row);
        }
        return res;
    }
}
