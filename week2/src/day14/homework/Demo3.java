package day14.homework;

public class Demo3 {
    public static void main(String[] args) {
        Computer computer = new Computer();
        System.out.println(computer.addNum(18, 99));
        System.out.println(computer.multiplication(4, 5));
        System.out.println(computer.subtraction(9, 88));
    }
}

interface Compute {
    int addNum(int a, int b);

    int subtraction(int a, int b);

    int multiplication(int a, int b);

    double division(int a, int b);
}

class Computer implements Compute {
    @Override
    public int addNum(int a, int b) {
        return a + b;
    }

    @Override
    public int subtraction(int a, int b) {
        return a - b;
    }

    @Override
    public int multiplication(int a, int b) {
        return a * b;
    }

    @Override
    public double division(int a, int b) {
        return a / b;
    }
}
