package Chapter02;
/*
 * 从命令行输入两个数字，判断两个数谁大谁小。（提示：读输入参数args[]；三元条件或 if/else ）
 */
public class Example05 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        if(a < b)
            System.out.println(a + " < " + b);
        else
            System.out.println(a + " > " + b);
    }
}
