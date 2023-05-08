package Chapter03;
/*
 * 设计一个接口circleInterface，要求接口中有一个定义PI的常量以及一个计算圆面积的空方法circleArea()。
 * 然后设计一个类circleClass实现该接口，通过构造方法circleClass(double r)定义圆半径，并增加一个显示圆面积的方法。
 * 最后，通过上述类生成两个半径分别为3.5、5.0的圆对象circle1、circle2进行测试。
 */
interface CircleInterface {
    double PI = 3.14;
    void CircleArea();
}

public class ClassCircle implements CircleInterface{
    double area, round;

    @Override
    public void CircleArea() {
        area = PI * round * round;
    }

    ClassCircle(double round){
        this.round = round;
    }

    void show(){
        System.out.println("面积：" + area);
    }

    public static void main(String[] args) {
        ClassCircle c1 = new ClassCircle(3.5);
        ClassCircle c2 = new ClassCircle(5.0);

        c1.CircleArea();
        c1.show();

        c2.CircleArea();
        c2.show();
    }
}

