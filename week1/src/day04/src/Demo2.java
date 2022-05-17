import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        double[] ary = new double[10];

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入十位学生的分数：");
        for (int i = 0; i < ary.length; i++) {
            double num = sc.nextDouble();
            ary[i] = num;
        }


        double averageScore = getAverageScore(ary);
        System.out.println("平均分是：" + averageScore);

    }


    public static double getAverageScore(double[] ary) {
        double sum = 0;
        for (double v : ary) {
            sum += v;
        }
        return sum / 10;
    }
}
