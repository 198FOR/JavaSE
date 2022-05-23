package day15.example;

public class Demo2 {
}

class Animal {
    int age;
    String name;
    double price;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Animal animal = (Animal) o;

        if (age != animal.age) return false;
        if (Double.compare(animal.price, price) != 0) return false;
        return name.equals(animal.name);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = age;
        result = 31 * result + name.hashCode();
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
