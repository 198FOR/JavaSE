package day16.example;

public class Demo1 {
    public static void main(String[] args) {
        String s1 = new String();
        System.out.println("s1 = " + s1);

        byte[] bytes = {97,98,99};
        String s2 = new String(bytes);
        System.out.println("s2 = " + s2);

        String s3 = new String(bytes,0,1);
        System.out.println("s3 = " + s3);

    }
}
