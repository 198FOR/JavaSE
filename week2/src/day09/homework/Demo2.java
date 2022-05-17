package day09.homework;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {

        String str1 = ScannerUtils.scanString();
        System.out.println(str1);

        int n1 = ScannerUtils.scanInt();
        System.out.println(n1);

        Person p1 = ScannerUtils.scanPerson();
        System.out.println(p1.name + " " + p1.age);
    }
}

class ScannerUtils {
    private static String str;
    private static int num;

    private static Scanner sc = new Scanner(System.in);

    private ScannerUtils() {

    }


    // 键盘录入字符串
    public static String scanString() {
        str = sc.next();
        return str;
    }

    // 键盘录入int整数
    public static int scanInt() {
        num = sc.nextInt();
        return num;
    }

    public static Person scanPerson(){
        str = sc.next();
        num = sc.nextInt();
        Person p = new Person();
        p.age = num;
        p.name = str;
        return p;
    }
}

class Person {
    int age;
    String name;
}
