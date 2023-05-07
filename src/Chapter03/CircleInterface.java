package Chapter03;

/*
 * 设计一个接口circleInterface，要求接口中有一个定义PI的常量以及一个计算圆面积的空方法circleArea()。
 * 然后设计一个类circleClass实现该接口，通过构造方法circleClass(double r)定义圆半径，并增加一个显示圆面积的方法。
 * 最后，通过上述类生成两个半径分别为3.5、5.0的圆对象circle1、circle2进行测试。
 */
interface circleInterface {
    double PI = 3.14;

    void circleArea();
}

class circleClass implements circleInterface {
    double r;
    double s;

    circleClass(double r) {
        this.r = r;
    }

    public static void main(String[] args) {
        circleClass c1 = new circleClass(3.5);
        c1.circleArea();
        c1.show();

        circleClass c2 = new circleClass(5.0);
        c2.circleArea();
        c2.show();
    }

    public void circleArea() {
        s = PI * r * r;
    }

    void show() {
        System.out.println("半径：" + r + "的圆面积：" + s);
    }
}