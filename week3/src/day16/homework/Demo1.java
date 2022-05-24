package day16.homework;

/**
 * Created with IntelliJ IDEA.
 * User: l98fo
 * Date: 2022/5/24
 * Time: 19:59
 * Description: No Description
 */
public class Demo1 {
    public static void main(String[] args) {
        String s1 = "abcabcabcd";
        String s2 = "abcabcdcba";
        System.out.println("s1.equals(s2) = " + s1.equals(s2));

        String s3 = "ABCABCabcd";
        System.out.println("s3.equalsIgnoreCase(s1) = " + s3.equalsIgnoreCase(s1));

        String s4 = "abcabcdcbaabc";
        System.out.println("s4.contains(s2) = " + s4.contains(s2));
        System.out.println("s4.startsWith(s2) = " + s4.startsWith(s2));
        char c = s4.charAt(9);
        System.out.println(c);
    }
}
