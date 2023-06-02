package Chapter02;

/*
 * 编写一个模拟同时掷骰子的程序。
 * 要用Math.random()模拟产生两个骰子，将两个结果相加，相加的和等于7的可能性最大，等于2和12的可能性最小。
 * 程序模投掷3600次，判断求和的结果是否合理。
 */
public class Example07 {
    public static void main(String[] args) {
        int r1 = 0, r2 = 0, sum = 0;
        int[] res = new int[13];

        for (int n = 0; n < 3600; n++) {
            r1 = (int) (Math.random() * 6 + 1);
            r2 = (int) (Math.random() * 6 + 1);
            sum = r1 + r2;
            res[sum]++;

        }
        for (int n = 2; n <= 12; n++) {
            System.out.println("和为 " + n + " 的次数：" + res[n]);
        }
    }
}
