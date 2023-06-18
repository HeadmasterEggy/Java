package Chapter03;
/*
 * 设计一个Shape接口和它的两个实现类Square和Circle,要求如下：
 * 1）Shape接口中有一个抽象方法area（），方法接收一个double类型的参数，返回一个double类型的结果。
 * 2）Square和Circle中实现了Shape接口的area()抽象方法，分别求正方形和圆形的面积并返回。
 * 在测试类中创建Square和Circle对象，计算边长为2的正方形面积和半径为3的圆面积。                            .
 */
interface Shape{
    double area(double num);
}

class Circles implements Shape {
    @Override
    public double area(double r) {
        return Math.PI * r * r;
    }
}
class Square implements Shape {
    @Override
    public double area(double l){
        return l * l;
    }
}

public class ShapeTest {
    public static void main(String[] args) {
        Shape square = new Square();
        Shape circle = new Circles();
        double length = square.area(2);
        double round = circle.area(3);
        System.out.println("正方形面积为：" + length);
        System.out.println("圆面积为：" + round);
    }
}