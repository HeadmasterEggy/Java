package Chapter02;
/*
 * 编写一个模拟同时掷骰子的程序。
 * 要用Math.random()模拟产生两个骰子，将两个结果相加，相加的和等于7的可能性最大，等于2和12的可能性最小。
 * 程序模投掷3600次，判断求和的结果是否合理。
 */
public class Example07 {
    public static void main(String[] args) {
        final int TRIES = 3600;
        int[] counts = new int[11];

        // 进行3600次掷骰子，并统计每个和出现的次数
        for (int i = 0; i < TRIES; i++) {
            int d1 = (int) (Math.random() * 6) + 1;
            int d2 = (int) (Math.random() * 6) + 1;
            counts[d1 + d2 - 2]++;
        }

        // 输出每个和出现的次数及占总次数的比例
        System.out.println("和\t出现次数\t出现概率");
        for (int i = 0; i < counts.length; i++) {
            int sum = i + 2;
            double probability = (double) counts[i] / TRIES;
            System.out.printf("%d\t%d\t\t%.2f%%\n", sum, counts[i], probability * 100);
        }
    }
}
