package Chapter03;
/*
 * 定义一个复数类complex,它的内部具有两个实例变量：realPart和imagPart，分别代表复数的实部和虚部，
 * 编程实现要求的数学运算：1)实现两个复数相加；2)实现两个复数相减；3)输出运算的结果。
 * 然后，调用上述方法实现两个复数18+2i、19-13i的相加、相减，并打印出结果。
 */
public class Complex {
    public double realPart;
    public double imagPart;

    public Complex(){
        realPart = 0;
        imagPart = 0;
    }

    public Complex (double realPart, double imagPart){
        this.realPart = realPart;
        this.imagPart = imagPart;
    }

    void add(Complex c1, Complex c2){
        realPart = c1.realPart + c2.realPart;
        imagPart = c1.imagPart + c2.imagPart;
    }

    void subtract(Complex c1, Complex c2){
        realPart = c1.realPart - c2.realPart;
        imagPart = c1.imagPart - c2.imagPart;
    }

    public String toString(){
        if(imagPart < 0)
            return realPart + String.valueOf(imagPart) + "i";
        else
            return realPart + "+" + imagPart + "i";
    }

    public static void main(String[] args) {
        Complex c = new Complex();
        Complex a = new Complex(18, 2);
        Complex b = new Complex(19, -13);
        c.add(a, b);
        System.out.println("sum: " + c);
        c.subtract(a, b);
        System.out.println("subtract: " + c);

    }
}
