package Chapter02;

/*
 * 角谷猜想：任何一个正整数n，如果它是偶数则除以2，如果是奇数则乘3加1，这样得到一个新的整数，
 * 如此继续进行上述处理，则最后得到的数一定是1。
 * 编写应用程序证明：在3~10000之间的所有正整数都符合上述规则。
 */
public class Example06 {
    public static void main(String[] args) {
        int tmp = 0;
        for (int n = 3; n <= 10000; n++) {
            tmp = n;
            while (tmp != 1) {
                if (tmp % 2 == 1)
                    tmp = tmp * 3 + 1;
                else
                    tmp = tmp / 2;
            }
            System.out.println(n + "符合角谷猜想！");
        }
    }
}
