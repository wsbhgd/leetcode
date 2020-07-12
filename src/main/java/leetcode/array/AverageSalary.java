package leetcode.array;

/**
 * @author mncool
 */
public class AverageSalary {

    public static void main(String[] args) {
        int[] salary = {1000, 2000, 3000};
        System.out.println(average(salary));
    }

    public static double average(int[] salary) {
        if (salary.length < 3) {
            return 0D;
        }
        double sum = 0;
        int max = salary[0];
        int min = salary[0];
        for (int i = 0, j = salary.length - 1; i <= j; i++, j--) {
            if (i == j) {
                int maxTmp = salary[i];
                int minTmp = salary[i];
                sum += salary[i];
                max = Math.max(max, maxTmp);
                min = Math.min(min, minTmp);
            } else {
                int maxTmp = Math.max(salary[i], salary[j]);
                int minTmp = Math.min(salary[i], salary[j]);
                sum += (salary[i] + salary[j]);
                max = Math.max(max, maxTmp);
                min = Math.min(min, minTmp);
            }

        }
        return (sum - max - min) / (salary.length - 2);
    }
}
