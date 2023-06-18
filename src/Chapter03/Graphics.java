package Chapter03;
/*
 * 设计一个抽象类Graphics,它具有一个String类型参数name和两个抽象方法parameter()、area()，
 * name用来存储图形的名称，parameter()方法用于输出图形的名称和其它属性特征，area()方法用于输出图形的面积。
 * 请用该类派生的子类实现输出一个形状为长方形、长为3宽为2和它面积以及输出一个形状为圆形、颜色为红色、半径为4和它面积。
 */
public abstract class Graphics {
    String name;

    public Graphics(String name){
        this.name = name;
    }

    abstract void parameter();

    abstract void area();
}

class Rectangle extends Graphics{
    int width;
    int length;

    public Rectangle(String name, int length, int width){
        super(name);
        this.width = width;
        this.length = length;
    }

    @Override
    public void parameter() {
        System.out.println("名称：" + name);
        System.out.println("长：" + length);
        System.out.println("宽：" + width);
    }

    @Override
    public void area() {
        System.out.println("面积：" + length * width);
    }
}

class Circle extends Graphics{
    double radius;
    String color;

    public Circle(String name, double radius, String color) {
        super(name);
        this.radius = radius;
        this.color = color;
    }

    @Override
    public void parameter() {
        System.out.println("图形名称：" + name);
        System.out.println("圆的颜色为：" + color + "\n" + "半径为：" + radius);
    }

    @Override
    public void area() {
        System.out.println("面积：" + Math.PI * radius * radius);
    }
}

class GraphicsTest {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle("长方形", 3, 2);
        r1.parameter();
        r1.area();

        System.out.println();

        Circle c1 = new Circle("圆形", 4, "红色");
        c1.parameter();
        c1.area();
    }
}