import java.util.Arrays;
import java.util.Scanner;

public class Demo4 {
    public static void main(String[] args) {
        String[] str = new String[]{"aa", "aa", "bb", "bb", "bb", "ccc", "ccc", "ddd"};
        System.out.println(Arrays.toString(str));

        System.out.println("请输入要删除的元素：");
        Scanner sc = new Scanner(System.in);
        String elem = sc.nextLine();

        int count = deleteName(str, elem);
        String[] str2 = new String[str.length - count];

        newName(str, count, str2);
        System.out.println(Arrays.toString(str2));


    }

    //将原数组要删除元素置为null
    public static int deleteName(String[] names, String target) {
        int count = 0;
        for (int i = 0; i < names.length; i++) {
            if (target.equals(names[i])) {
                // 找到了,置为null,删除成功
                names[i] = null;
                count++;

            }
        }
        System.out.println("一共删掉了" + count + "个元素");
        return count;
    }

    //创建新数组放置未删除的元素
    public static void newName(String[] names, int count, String[] strr) {
        int newIndex = 0;

        String[] str2 = new String[names.length - count];
        for (int i = 0; i < names.length; i++) {
            if (names[i] != null) {
                str2[newIndex] = names[i];
                newIndex++;
            }
        }
       // System.out.println(Arrays.toString(str2));

        int newIndex2 = 0;
        for (int i = 0; i < str2.length; i++) {
            strr[newIndex2] = str2[i];
            newIndex2++;
        }
    }

}




