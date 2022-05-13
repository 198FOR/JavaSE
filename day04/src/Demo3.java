import java.util.Arrays;

public class Demo3 {
    public static void main(String[] args) {
        String[] str = new String[]{"你好","世界","Java","Python","张码子"};

        System.out.println("数组的长度为：" + str.length);

        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i] + " ");
        }


        System.out.println();

        for (String s : str) {
            System.out.print(s + " ");
        }

        System.out.println();

        System.out.println(Arrays.toString(str));
    }
}
