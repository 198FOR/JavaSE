package day11.homework;

public class Demo2 {
    public static void main(String[] args) {
       SouthPerson sp1 = new SouthPerson();
       NorthPerson np1 = new NorthPerson();
       getEat(sp1,np1);


       Person p1 = new SouthPerson();

    }


    public static void  getEat(SouthPerson sp1,NorthPerson np1){
        sp1.eat();
        np1.eat();
    }
}

class Person{
    String name;
    int age;
    public void eat(){
        System.out.println("人都要吃饭");
    }

    public Person() {
    }
}

class SouthPerson extends Person{
    double salary;

    public SouthPerson() {
    }

    @Override
    public void eat() {
        System.out.println("南方人喜欢吃米饭");
    }

    public void swim(){
        System.out.println("南方人会游泳");
    }
}

class NorthPerson extends Person{
    double height;

    @Override
    public void eat() {
        System.out.println("北方人喜欢吃面食");
    }

    public void drink(){
        System.out.println("北方人喜欢喝酒");
    }
}
