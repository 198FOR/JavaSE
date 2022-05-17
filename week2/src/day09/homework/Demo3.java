package day09.homework;

public class Demo3 {
    public static void main(String[] args) {
        Student s1 = Student.getInstance();
        Student s2 = Student.getInstance();
        Student s3 = Student.getInstance();
        Student s4 = Student.getInstance();
        Student s5 = Student.getInstance();
        Student s6 = Student.getInstance();
        Student s7 = Student.getInstance();
        Student s8 = Student.getInstance();
        Student s9 = Student.getInstance();
        Student s10 = Student.getInstance();
        Student s11 = Student.getInstance();
        Student s12 = Student.getInstance();
        Student s13 = Student.getInstance();

    }
}

class Student {
    static int num = 1;

    private Student() {
    }

    public static Student getInstance() {
        if (num <= 10) {
            System.out.println("这是你创建的第" + num + "个对象");
            Student student = new Student();
            num++;
            return student;
        } else {
            System.out.println("无法再创建了");
            return null;
        }
    }
}
