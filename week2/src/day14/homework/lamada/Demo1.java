package day14.homework.lamada;

public class Demo1 {
    public static void main(String[] args) {
        INoReturnNoParam ip5 = () -> {
            System.out.println("hello world!");
        };
        ip5.test();

        INoReturnOneParam ip3 = (a) -> {
            System.out.println("a的值是" + a);
        };
        ip3.test(666);

        // 形参列表的简化
        INoReturnTwoParam ip1 = (a, b) -> {
            System.out.println("这两个数的和是" + (a + b));
        };
        ip1.test(10, 20);

        // 简化大括号
        INoReturnNoParam ip6 = () -> System.out.println("你好世界！");
        ip6.test();


    }
}

//无返回值无参数的功能接口
@FunctionalInterface
interface INoReturnNoParam {
    void test();
}

//无返回值有一个参数的功能接口
@FunctionalInterface
interface INoReturnOneParam {
    void test(int a);
}

//无返回值两个参数的功能接口
@FunctionalInterface
interface INoReturnTwoParam {
    void test(int a, int b);
}

//有返回值无参数的功能接口
@FunctionalInterface
interface IHasReturnNoParam {
    int test();
}

//有返回值一个参数的功能接口
@FunctionalInterface
interface IHasReturnOneParam {
    int method(int a);
}

//有返回值两个参数的功能接口
@FunctionalInterface
interface IHasReturnTwoParam {
    int test(int a, int b);
}
