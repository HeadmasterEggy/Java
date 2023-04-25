package Chapter02;
import java.util.Random;
import java.util.Scanner;
/*
 * 编写一个猜数字游戏的程序，预先生成一个0-9的随机数，用户键盘录入一个所猜的数字，
 * 如果输入的数字和后台预先生成的数字相同，则表示猜对了，这时，程序会打印“恭喜您，答对了！”
 * 如果不相同，则比较输入的数字和后台预先生成的数字大小，如果大了，打印“sorry，您猜大了！”如果小了，打印“sorry，您猜小了！”
 * 如果一直猜错，则游戏一直继续，直到数字猜对为止。（教材任务2-2）
 */
public class Example12 {

    public static void main(String[] args) {
        // 生成随机数
        Random random = new Random();
        int number = random.nextInt(10);

        // 猜数字游戏
        Scanner cin = new Scanner(System.in);
        int guess;

        System.out.println("猜数字游戏开始啦！");
        do {
            System.out.print("请输入一个数字（0-9）：");
            guess = cin.nextInt();
            if (guess == number) {
                System.out.println("恭喜您，猜对了！");
            } else if (guess > number) {
                System.out.println("sorry，猜大了！");
            } else {
                System.out.println("sorry，猜小了！");
            }
        } while (guess != number);

        System.out.println("游戏结束！");
    }

}