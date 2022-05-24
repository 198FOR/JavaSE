package day16.homework;

import java.util.Locale;

/**
 * Created with IntelliJ IDEA.
 * User: l98fo
 * Date: 2022/5/24
 * Time: 20:29
 * Description: No Description
 */
public class Demo3 {
    public static void main(String[] args) {
        String s = "lengendary";
        String s1 = "";
        String s2 = "";
        String newS = "";
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 ==0){
                s1 = s.substring(i,i+1);
                String s11 = s1.toUpperCase();
                newS = newS + s11;
            }
            else {
                s2 = s.substring(i,i+1);
                String s22 = s2.toLowerCase();
                newS = newS + s22;
            }
        }


        System.out.println(newS);

    }
}
