package Chapter02;
import java.util.Scanner;
/*
 * 从键盘读取一个矩形的长度，然后输出一个空心矩形
 */
public class Example09 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.print("输入矩形的长度：");
        int n = cin.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); // 换行
        }
    }
}
