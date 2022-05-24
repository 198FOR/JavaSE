package day16.homework;

import sun.security.rsa.RSAUtil;

import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: l98fo
 * Date: 2022/5/24
 * Time: 21:14
 * Description: No Description
 */
public class Demo6 {
    public static void main(String[] args) {
        Random R = new Random();
        int randomNum = R.nextInt(1000);
        String s = Integer.toString(randomNum);
        for (int i = 0; i < 1000; i++) {
            System.out.println(i);
            if (i == randomNum){
                String s1 = Integer.toString(i);
                System.out.println("破解成功！密码是" + i);
                break;
            }
        }




    }
}
