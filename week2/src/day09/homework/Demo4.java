package day09.homework;

import jdk.nashorn.internal.objects.annotations.Getter;

public class Demo4 {
    public static void main(String[] args) {

        Rectangle R1 = new Rectangle();
        R1.setLength(80);
        R1.setWidth(40);
        //长方形面积
        System.out.println("长方形的面积是" + R1.getArea());
        //长方形周长
        System.out.println("长方形的周长是" + R1.getPerimeter());
        Square S1 = new Square();
        S1.setSideLength(16);
        //正方形周长
        System.out.println("正方形的周长是" + S1.getPerimeter());
        // 正方形面积
        System.out.println("正方形的面积是" + S1.getArea());
    }
}

class Rectangle {
    private double width;
    private double length;


    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength(){
        return length;
    }
    public void setLength(double length){
        this.length = length;
    }

    public double getArea(){
        return width*length;
    }

    public double getPerimeter(){
        return (width+length)*2;
    }

}

class Square {
    private double sideLength;

    public double getSideLength() {
        return sideLength;
    }

    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }

    public double getArea(){
        return sideLength*sideLength;
    }
    public double getPerimeter(){
        return sideLength*4;
    }
}
