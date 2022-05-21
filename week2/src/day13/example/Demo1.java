package day13.example;

public class Demo1 {
    public static void main(String[] args) {
        Computer c = new Computer();
        System.out.println(c.a);



    }
}
class Computer{
    int a = 3;
    private class CPU{
        int a = 4;

    }
}
