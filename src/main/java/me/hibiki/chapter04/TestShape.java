package me.hibiki.chapter04;

/**
 * @author koukoukon
 * @date 2022/10/19 15:17
 */
public class TestShape {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(15, 20);
        System.out.println(rectangle.area());
        Circle circle = new Circle(15, 15, 5);
        System.out.println(circle.area());
        Shape shape = new Rectangle(15, 20);
        System.out.println(shape.area());
        shape = new Circle(15, 15, 5);
        System.out.println(shape.area());
    }
}

abstract class Shape {
    protected double length = 0.0d;
    protected double width = 0.0d;

    public Shape(double length, double width) {
        this.length = length;
        this.width = width;
    }

    abstract double area();
}

class Rectangle extends Shape {

    public Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    double area() {
        System.out.println("长方形的面积为：");
        return length * width;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double length, double width, double radius) {
        super(length, width);
        this.radius = radius;
    }

    @Override
    double area() {
        System.out.println("圆形位置在（" + length + "， " + width + "）的圆形面积为：");
        return 3.14 * radius * radius;
    }
}