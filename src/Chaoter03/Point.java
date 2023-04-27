package Chaoter03;
/*
 * 将笛卡尔坐标系上的点定义为一个类Point，
 * 该类要求提供求得坐标系上两点间距离的功能、获取和设置坐标的功能、获取极坐标的功能，以及完成对已创建的Point类对象进行个数统计的功能。
 * 设计测试Point类的应用程序主类，测试并显示输出提供所有功能的结果。Math.atan2();Math.sqrt() 方法可返回一个数的平方根
 */
public class Point {
    private double x, y;
    private static int count = 0;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
        count++;    // 每创建一个 Point 对象，count 加 1
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public static int getCount() {
        return count;
    }

    public double distance(Point p) {
        double dx = x - p.x;
        double dy = y - p.y;
        return Math.sqrt(dx * dx + dy * dy);    // 计算两点间距离公式
    }

    public double polarAngle() {
        return Math.atan2(y, x);    // 计算极坐标角度，返回弧度制数值
    }

    public static void main(String[] args) {
        Point p1 = new Point(1, 2);
        Point p2 = new Point(4, 5);

        System.out.println("点 p1 的坐标为 (" + p1.getX() + ", " + p1.getY() + ")");
        System.out.println("点 p2 的坐标为 (" + p2.getX() + ", " + p2.getY() + ")");
        System.out.println("p1 和 p2 之间的距离为 " + p1.distance(p2));
        System.out.println("点 p1 的极坐标角度为 " + p1.polarAngle());
        System.out.println("点 p2 的极坐标角度为 " + p2.polarAngle());
        System.out.println("已创建 Point 对象的个数为 " + Point.getCount());
    }
}
