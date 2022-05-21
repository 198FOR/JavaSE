package day12.homework;

public class Demo1 {
    public static void main(String[] args) {
        Person p1;
        p1 = new Student();
        System.out.println(p1.name);
        System.out.println(p1.age);
        System.out.println("--------------------------------");
        p1.eat();
        p1.sleep();
        //p1.learn();
        ((Student) p1).learn();

        p1 = new Teacher();
        System.out.println(p1.name);
        System.out.println(p1.age);

        System.out.println("--------------------------------");
        Teacher t1 = new Teacher();
        System.out.println(t1.name);
        System.out.println(t1.age);
        t1.sleep();
        t1.learn();
    }
}

abstract class Person {
    String name = "人";
    String gender = "性别";
    int age = 0;

    public abstract void eat();

    public abstract void sleep();
}

interface ILearn {
    abstract void learn();
}

class Student extends Person implements ILearn {
    String name = "西欧";
    String gender = "男";
    int age = 18;


    @Override
    public void eat() {
        System.out.println("学生吃饭了");
    }

    @Override
    public void sleep() {
        System.out.println("学生睡觉了");
    }

    @Override
    public void learn() {
        System.out.println("增强实践动手能力");
    }
}

class Teacher extends Person implements ILearn {
    String name = "小小";
    String gender = "女";
    int age = 35;


    @Override
    public void eat() {
        System.out.println("老师吃饭了");
    }

    @Override
    public void sleep() {
        System.out.println("老师睡觉了");
    }

    @Override
    public void learn() {
        System.out.println("增强语言能力");
    }
}
