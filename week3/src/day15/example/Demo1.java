package day15.example;

public class Demo1 {
    public static void main(String[] args) {
        Student s1 = new Student();
        Class stuClazz1 = s1.getClass();


        Teacher t1 = new Teacher();
        Class teaClazz1 = t1.getClass();
        System.out.println(stuClazz1 == teaClazz1);
    }
}

class Student {

}

class Teacher {

}



