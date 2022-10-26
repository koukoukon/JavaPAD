package me.hibiki.experiment;

/**
 * @author koukoukon
 * @date 2022/10/20 17:25
 */
public class TestTriangle {
    public static void main(String[] args) {
        Point point1 = new Point(0, 0);
        Point point2 = new Point(3, 0);
        Point point3 = new Point(0, 4);
        //使用无参构造方法创建对象并使用setTri方法进行初始化
//        Triangle triangle = new Triangle();
//        triangle.setTri(point1, point2, point3);
        //使用有参构造方法实现初始化
        Triangle triangle = new Triangle(point1, point2, point3);
        System.out.println("此三角形的周长为："+triangle.getPerimeter());
        System.out.println("此三角形的面积为："+triangle.getArea());
    }
}

class Triangle {
    private Point point1, point2, point3;
    private double a, b, c;

    public void setTri(Point point1, Point point2, Point point3) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }

    public Triangle() {
    }

    public Triangle(Point point1, Point point2, Point point3) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }

    private void getSideLength() {
        a = Math.sqrt(Math.pow((point2.getX() - point1.getX()), 2) + Math.pow((point2.getY() - point1.getY()), 2));
        b = Math.sqrt(Math.pow((point3.getX() - point2.getX()), 2) + Math.pow((point3.getY() - point2.getY()), 2));
        c = Math.sqrt(Math.pow((point3.getX() - point1.getX()), 2) + Math.pow((point3.getY() - point1.getY()), 2));
    }

    public double getPerimeter() {
        getSideLength();
        return a + b + c;
    }

    public double getArea() {
        getSideLength();
        double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}

class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}