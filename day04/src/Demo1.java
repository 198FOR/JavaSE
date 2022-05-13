import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        double[] ary = new double[10];

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入十位评委的分数：");
        for (int i = 0; i < ary.length; i++) {
            double num = sc.nextDouble();
            ary[i] = num;
        }

        double maxScore = getMaxScore(ary);
        double minScore = getMinScore(ary);
        System.out.println("最高分是" + maxScore + "，最低分是" + minScore);
        double averageScore = getAverageScore(ary, maxScore, minScore);
        System.out.println("平均分是：" + averageScore);
    }

    //求最高分
    public static double getMaxScore(double[] ary) {
        double maxScore = ary[0];
        for (double i : ary) {
            if (maxScore < i) {
                maxScore = i;
            }
        }
        return maxScore;
    }

    //求最低分
    public static double getMinScore(double[] ary) {
        double minScore = ary[0];
        for (double i : ary) {
            if (minScore > i) {
                minScore = i;
            }
        }
        return minScore;
    }
    //求平均分

    public static double getAverageScore(double[] ary, double maxScore, double minScore) {
        double sum = 0;
        for (double v : ary) {
            sum += v;
        }
        return (sum - maxScore - minScore) / 8;


    }
}
