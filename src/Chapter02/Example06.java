package Chapter02;
/*
 * 角谷猜想：任何一个正整数n，如果它是偶数则除以2，如果是奇数则乘3加1，这样得到一个新的整数，
 * 如此继续进行上述处理，则最后得到的数一定是1。
 * 编写应用程序证明：在3~10000之间的所有正整数都符合上述规则。
 */
public class Example06 {
    public static void main(String[] args) {
        int flag = 2, num = 10000;
        for (int i = 3; i <= num; i++) {
            int k = i;
            while (true) {
                if (k % 2 == 0)
                    k /= 2;
                else
                    k = k * 3 + 1;

                if (k == 1) {
                    flag++;
                    break;
                }
            }
        }
        if (flag == num)
            System.out.println("在3~10000之间的所有正整数都符合上述规则");
    }
}
