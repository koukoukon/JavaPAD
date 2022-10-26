package me.hibiki.experiment;

/**
 * @author koukoukon
 * @date 2022/10/21 17:36
 */
public class Circle {
    private double x;
    private double y;
    private double radius;

    public Circle(double x, double y) {
        this.x = x;
        this.y = y;
        this.radius = 1;
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

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public static void main(String[] args) {
        Circle circle = new Circle(0, 0);
        System.out.println("使用有参构造方法初始化该圆的圆心坐标及半径");
        System.out.println("该圆的半径为：" + circle.getRadius());
        System.out.println("该圆的圆心坐标为：（" + circle.getX() + "," + circle.getY() + ")");
        //使用set方法给该圆的圆心坐标及半径重新赋值
        circle.setX(1);
        circle.setY(1);
        circle.setRadius(3);
        System.out.println("使用set方法设置该圆的圆心坐标及半径后的结果");
        System.out.println("该圆的圆心坐标为：（" + circle.getX() + "," + circle.getY() + ")");
        System.out.println("该圆的半径为：" + circle.getRadius());
    }
}
