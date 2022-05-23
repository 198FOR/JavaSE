package day14.homework;

public class Demo2{
    public static void main(String[] args){
//(1)创建并初始化Bean1类对象bean1
        Demo2 demo2 = new Demo2();
        Bean1 bean1 = demo2.new Bean1();
        bean1.i++;
//(2)创建并初始化Bean2类对象bean2
        Bean2 bean2 = new Bean2();
        bean2.j++;
//(3)创建并初始化Bean3类对象bean3
        Bean.Bean3 bean3 = new Bean().new Bean3();
        bean3.k++;
    }
    class Bean1{
        public int i = 0;
    }
    static class Bean2{
        public int j = 0;
    }
}
class Bean{
    class Bean3{
        public int k = 0;
    }
}