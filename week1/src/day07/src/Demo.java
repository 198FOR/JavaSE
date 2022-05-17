/*
* 引用数组的初始化
*
* */
public class Demo {
    public static void main(String[] args) {
    Person[] students = new Person[2];
    Person lee = new Person();
    Person zhang = new Person();
    lee.age = 20;
    lee.name = "黎明";
    zhang.age = 10;
    zhang.name = "李小龙";
    students[0] = lee;
    students[1] = zhang;
    students[1].print();
    students[0].print();

    }
}
class Person {
    int age;
    String name;
    public void print(){
        System.out.println("我的年龄是" + age + "，我的名字是" + name);
    }
}
