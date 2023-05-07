package Chapter03;
/*
 * 首先定义一个计算长方形面积的类rectangleClass，
 * 要求类中有一个定义长方形左上角和右下角座标的构造方法，以及一个通过长方形右下角座标与左上角座标计算长方形面积的方法area,
 * 并实例化两个长方形进行测试。Math.abs求绝对值
 */
public class rectangleClass {
    private final int x1;
    private final int x2;
    private final int y1;
    private final int y2;

    public rectangleClass(int x1, int y1, int x2, int y2){
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    public int area(){
        int length = Math.abs(x1 - x2);
        int width = Math.abs(y1 - y2);
        return length * width;
    }

    public static void main(String[] args) {
        rectangleClass rec1 = new rectangleClass(1, 2, 6 , 4);
        rectangleClass rec2 = new rectangleClass(3, 6, 10 ,12);
        System.out.println("area1: " + rec1.area());
        System.out.println("area2: " + rec2.area());
    }
}
