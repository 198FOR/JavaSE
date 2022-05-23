package day14.homework.interface2;

public class Demo3 {
    public static void main(String[] args) {
        test();
    }

    interface Compute {
        int addNum(int a, int b);

        int subtraction(int a, int b);

        int multiplication(int a, int b);

        double division(int a, int b);
    }

    public static void test() {


        class Computer implements Compute {

            @Override
            public int addNum(int a, int b) {
                a = 5;
                b = 10;
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
        Computer computer = new Computer();
        System.out.println(computer.addNum(10, 20));
        System.out.println(computer.multiplication(5, 60));
    }
}
