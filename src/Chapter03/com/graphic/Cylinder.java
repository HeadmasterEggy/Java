package Chapter03.com.graphic;
/*
 * 在com.graphic包中定义一个圆柱体类Cylinder，其半径r，高h都为私有属性，有构造方法和求体积方法volume()
 */
public class Cylinder {
    private double r, h;

    public Cylinder(double r, double h){
        this.h = h;
        this.r = r;
    }

    public double getH() {
        return h;
    }

    public double getR() {
        return r;
    }

    public double volume() {
        return Math.PI * r * r * h;
    }
}
