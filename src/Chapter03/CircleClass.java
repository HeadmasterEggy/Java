package Chapter03;
/*
 * 首先定义一个计算二维坐标系中圆面积的类circleClass，要求类中有一个定义圆心座标,圆上一点座标的构造方法，以及一个通过圆上一点座标与圆心座标计算圆面积的方法area。
 * 然后，通过上述类生成两个圆对象circle1、circle2进行测试：
 * 一个圆心、圆上一点座标分别为(0,0)、(8.5,9)，另一个圆心、圆上一点座标分别为(2,3.5)、(9,6)，并分别显示各自面积。Math.pow(x底数,y几次方) ,x 的 y 次幂
 */
public class CircleClass {
    Points p1, p2;
    CircleClass(Points p1, Points p2){
        this.p1 = p1;
        this.p2 = p2;
    }
    void area(){
        System.out.println("面积：" + Math.PI * (Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2)));
    }
    public static void main(String[] args) {
        Points q1, q2, q3, q4;
        q1 = new Points(0, 0);
        q2 = new Points(8.5, 9);

        q3 = new Points(2, 3.5);
        q4 = new Points(9, 6);

        CircleClass circle1 = new CircleClass(q1, q2);
        circle1.area();

        CircleClass circle2 = new CircleClass(q3, q4);
        circle2.area();
    }
}

class Points{
    double x, y;
    public Points(double x, double y) {
        this.x = x;
        this.y = y;
    }
}
