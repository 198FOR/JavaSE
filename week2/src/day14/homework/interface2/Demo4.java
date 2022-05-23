package day14.homework.interface2;

public class Demo4 {
    public static void main(String[] args) {
        new Compute() {
            @Override
            public void addNum(int a, int b) {
                System.out.println(a+b);
            }

            @Override
            public void subtraction(int a, int b) {
                System.out.println(a - b);
            }

            @Override
            public void multiplication(int a, int b) {
                System.out.println(a * b);
            }

            @Override
            public void division(int a, int b) {
                System.out.println(a / b);
            }
        };
    }
}

interface Compute {
    void addNum(int a, int b);

    void subtraction(int a, int b);

    void multiplication(int a, int b);

    void division(int a, int b);
}
