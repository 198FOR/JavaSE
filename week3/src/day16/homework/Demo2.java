package day16.homework;

/**
 * Created with IntelliJ IDEA.
 * User: l98fo
 * Date: 2022/5/24
 * Time: 20:07
 * Description: No Description
 */
public class Demo2 {
    public static void main(String[] args) {
        String s1 = "woaijavawozhenaijavawozhendeaijavawozhendehenaijavaxinbuxinwoaijavagun";
        String s2 = "java";

        int fromIndex = 0;
        int count = 0;

        while ((fromIndex = s1.indexOf(s2,fromIndex)) != -1) {
            count++;
            fromIndex++;
        }
        System.out.println("出现的次数" + count);

    }
}
