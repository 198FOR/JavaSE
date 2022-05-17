package homework;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {

        Student[] stu = new Student[5];
        stuScan(stu);

        for (int i = 0; i < 5; i++) {
            stu[i].print();
        }

        getAvg(stu);
    }


    //输入学生信息
    public static void stuScan(Student[] stu) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {

            Student student = new Student();
            System.out.println("请输入第" + (i + 1) + "个学生的姓名：");
            student.name = sc.next();
            System.out.println("请输入第" + (i + 1) + "个学生的学号：");
            student.stuId = sc.nextInt();
            System.out.println("请输入第" + (i + 1) + "个学生的性别：");
            student.gender = sc.next();
            System.out.println("请输入" + (i + 1) + "个学生的年龄：");
            student.age = sc.nextInt();
            System.out.println("请输入" + (i + 1) + "个学生的分数：");
            student.score = sc.nextDouble();
            stu[i] = student;
        }
    }

    //求平均分
    public static void getAvg(Student[] stu) {
        double count = 0;
        double avg = 0;
        for (Student student : stu) {
            count += student.score;
        }
        avg = count / 5;
        System.out.println("平均分为" + avg);
    }

}

class Student {
    String name;
    int stuId;
    String gender;
    int age;
    double score;

    public Student() {
    }

    public Student(String name, int stuId, String gender, int age, double score) {
        this.name = name;
        this.stuId = stuId;
        this.gender = gender;
        this.age = age;
        this.score = score;
    }

    public void print() {
        System.out.println(name + " " + stuId + " " + gender + " " + age + " " + score);
    }
}

