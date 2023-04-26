package Chaoter03.Example01;
/*
 * 首先定义一个计算二维坐标系中圆面积的类circleClass，要求类中有一个定义圆心座标,圆上一点座标的构造方法，以及一个通过圆上一点座标与圆心座标计算圆面积的方法area。
 * 然后，通过上述类生成两个圆对象circle1、circle2进行测试：
 * 一个圆心、圆上一点座标分别为(0,0)、(8.5,9)，另一个圆心、圆上一点座标分别为(2,3.5)、(9,6)，并分别显示各自面积。Math.pow(x底数,y几次方) ,x 的 y 次幂
 */
public class CircleClass {
    private double centerX;  // 圆心X坐标
    private double centerY;  // 圆心Y坐标
    private double pointX;   // 圆上一点X坐标
    private double pointY;   // 圆上一点Y坐标

    public CircleClass(double centerX, double centerY, double pointX, double pointY) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.pointX = pointX;
        this.pointY = pointY;
    }

    public double area() {
        double r = Math.sqrt(Math.pow(pointX - centerX, 2) + Math.pow(pointY - centerY, 2)); // 计算半径
        return Math.PI * Math.pow(r, 2); // 计算面积
    }

    public static void main(String[] args) {
        // 创建两个圆对象
        CircleClass circle1 = new CircleClass(0, 0, 8.5, 9);
        CircleClass circle2 = new CircleClass(2, 3.5, 9, 6);

        // 显示各自面积
        System.out.println("圆1的面积：" + circle1.area());
        System.out.println("圆2的面积：" + circle2.area());
    }
}

