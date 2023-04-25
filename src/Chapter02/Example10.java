package Chapter02;
import java.util.Scanner;
/*
 * 从键盘读取一个矩形外边和内边的长度，然后输出一个空心矩形
 */
public class Example10 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        System.out.print("请输入矩形外边的长度：");
        int outerLength = cin.nextInt();

        System.out.print("请输入矩形内边的长度：");
        int innerLength = cin.nextInt();

        int x = (outerLength - innerLength) / 2;

        // 输出外边框的上半部分
        for(int i = 1; i <= x; i++){
            for(int j =  1; j <= outerLength; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        // 输出内部空心部分
        for(int i = 1; i <= innerLength; i++){
            // 输出左侧边框
            for(int j = 1; j <= x; j++){
                System.out.print("* ");
            }

            // 输出内部空格
            for(int j = 1; j <= innerLength; j++){
                System.out.print("  "); // 中间部分是空心，输出两个空格
            }

            // 输出右侧边框
            for(int j = 1; j <= x; j++){
                System.out.print("* ");
            }

            System.out.println();
        }

        // 输出外边框的下半部分
        for(int i = 1; i <= x; i++){
            for(int j =  1; j <= outerLength; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}