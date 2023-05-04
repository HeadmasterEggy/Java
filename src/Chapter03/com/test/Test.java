package Chapter03.com.test;
import Chapter03.com.graphic.Cylinder;
/*
 * 在com.test包中定义一个测试类test，测试一个半径为5.34、高为2的圆柱体体积。半径PI为3.14。
 */
public class Test {
    public static void main(String[] args) {
        Cylinder c1 = new Cylinder(5.34, 2);
        System.out.println("半径为：" + c1.getR());
        System.out.println("高为：" + c1.getH());
        System.out.println("体积为: " + c1.volume());
    }
}
