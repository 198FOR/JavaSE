public class Demo3 {
    public static void main(String[] args) {
        System.out.println(DecimalToBinaryByRecursion(8));
    }

    public static String DecimalToBinaryByRecursion(int num) {
        int quotient = num / 2;
        int remainder = num % 2;
        String resulet = "";
        if (quotient == 0) {
            return resulet + remainder;
        }
        return DecimalToBinaryByRecursion(quotient) + remainder;
    }
}
