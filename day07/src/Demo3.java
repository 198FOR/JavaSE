public class Demo3 {
    public static void main(String[] args) {
      print();
    }

public static void print(String a){
    System.out.println(a);
    System.out.println("world");
}
public static void print(String... aa){
    for (String s : aa) {
        System.out.println(s);
    }
    System.out.println("hello");
}
}


