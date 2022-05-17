public class Demo2 {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car);
        car.print();
    }
}
class Car{
    public void print(){
        System.out.println(this);
    }
}
