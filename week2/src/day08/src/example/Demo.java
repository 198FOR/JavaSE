package example;

public class Demo {
    public static void main(String[] args) {
        Cat c = new Cat(28, "紫色",50);
        System.out.println(c.age);
        System.out.println(c.color);
        System.out.println(c.mm);
    }
}


class Cat {
    {
        age = 18;
        System.out.println("age building block");
    }
    static int mm = 20;


    int age = 10;
    String color = "黄色";


    {
        color = "黑色";
        System.out.println("color building block");
    }


    public Cat() {
    }


    public Cat(int age) {
        System.out.println("age constructor");
        this.age = age;
    }


    public Cat(int age, String color,int mm) {
        this(age);
        System.out.println("age color constructor");
        this.color = color;
        mm = 80;
    }
}