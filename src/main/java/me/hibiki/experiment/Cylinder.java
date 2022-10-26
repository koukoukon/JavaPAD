package me.hibiki.experiment;

/**
 * @author koukoukon
 * @date 2022/10/21 16:41
 */
public class Cylinder {
    public static final double PI = 3.14;
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double getSurfaceArea() {
        return 2 * PI * radius * (height + radius);
    }

    public double getVolume() {
        return PI * radius * radius * height;
    }

    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(10, 5);
        System.out.println("此圆柱体的表面积为：" + cylinder.getSurfaceArea());
        System.out.println("此圆柱体的体积为：" + cylinder.getVolume());
    }

}
