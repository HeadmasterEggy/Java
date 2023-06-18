/*
 * 设计一个接口circleInterface，要求接口中有一个定义PI的常量以及一个计算圆面积的空方法circleArea()。
 * 然后设计一个类circleClass实现该接口，通过构造方法circleClass(double r)定义圆半径，并增加一个显示圆面积的方法。
 * 最后，通过上述类生成两个半径分别为3.5、5.0的圆对象circle1、circle2进行测试。
 */
interface circleinterface{
    double PI = Math.PI;
    void circlearea();
}

class circleclass implements circleinterface{
    double area;
    public circleclass(double x) {
        area = x * x * PI;
    }

    @Override
    public void circlearea() {
        System.out.println(area);
    }
}

class Test{
    public static void main(String[] args) {
        circleclass c1 = new circleclass(3.5);
        circleclass c2 = new circleclass(5);
        c1.circlearea();
        c2.circlearea();
    }
}