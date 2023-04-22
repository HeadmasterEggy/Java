package Chapter02;
/*
 * 从命令行输入一个数字，判断它是奇数还是偶数。（提示：利用%；三元条件或 if/else ；int a=Integer.parseInt(args[0])  //数据输入）
 */
public class Example04 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        if(a % 2 == 0)
            System.out.println("Odd");
        else
            System.out.println("Even");
    }
}
