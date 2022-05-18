package day10.homework;

import java.util.Random;
import java.util.Scanner;

public class GuessNum {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int num = r.nextInt(100);
        System.out.println(num);
        System.out.println("猜猜生成的数字是多少：");
        int guessNum = sc.nextInt();
        while (true){

            if (guessNum > num){
                System.out.println("猜的数字大了，请再猜一下");
                guessNum = sc.nextInt();
            }
            else if (guessNum < num) {
                System.out.println("猜的数字小了，请再猜一下");
                guessNum = sc.nextInt();
            }
            else {
                System.out.println("恭喜你，猜中了，随机数是" + guessNum);
                break;
            }
        }
    }
}
