package day11.homework;

class  Student{
    int age;
    String name;
    static int var;
    public Student(){
    }
    public Student(int age){
        this.age = age;
    }
    public Student(String name){
        this(var);
        this.name = name;
    }
}
