package Chaoter03;
/*
 * 定义一个复数类complex,它的内部具有两个实例变量：realPart和imagPart，分别代表复数的实部和虚部，
 * 编程实现要求的数学运算：1)实现两个复数相加；2)实现两个复数相减；3)输出运算的结果。
 * 然后，调用上述方法实现两个复数18+2i、19-13i的相加、相减，并打印出结果。
 */
public class Complex {
    private final double realPart;
    private final double imagPart;

    public Complex (double realPart, double imagPart){
        this.realPart = realPart;
        this.imagPart = imagPart;
    }

    public Complex add(Complex other){
        double addReal = this.realPart + other.realPart;
        double addImag = this.imagPart + other.imagPart;
        return new Complex(addReal, addImag);
    }

    public Complex subtract(Complex other){
        double subReal = this.realPart - other.realPart;
        double subImag = this.imagPart - other.imagPart;
        return new Complex(subReal, subImag);
    }

    public String toString(){
        if(imagPart < 0)
            return realPart + String.valueOf(imagPart) + "i";
        else
            return realPart + "+" + imagPart + "i";
    }

    public static void main(String[] args) {
        Complex a = new Complex(18, 2);
        Complex b = new Complex(19, -13);
        Complex sum = a.add(b);
        Complex sub = a.subtract(b);
        System.out.println("sum: " + sum);
        System.out.println("subtract: " + sub);

    }
}
