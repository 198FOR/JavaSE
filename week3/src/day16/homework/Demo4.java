package day16.homework;

/**
 * Created with IntelliJ IDEA.
 * User: l98fo
 * Date: 2022/5/24
 * Time: 20:46
 * Description: No Description
 */
public class Demo4 {
    public static void main(String[] args) {
        String s = "peter piper picked a peck of pickled peppers";
        String[] s1 = s.split(" ");
        int count = 0;
        for (String s2 : s1) {
            if (s2.startsWith("p"))
            {
                count++;
            }
        }
        System.out.println("一共有" + count + "个以p开头的单词");
    }
}
