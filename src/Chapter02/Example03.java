package Chapter02;
/*
 * 从命令行输入几个字符串，统计并打印出输入字符串的个数、以及各字符串的字符个数。（提示：args.length / args[k].length() ）.
 */
public class Example03 {
    public static void main(String[] args) {
        System.out.println("输入字符串的个数：" + args.length);
        for(int i = 1; i <= args.length; i++){
            System.out.println("字符串" + i + "的个数为：" + args[i].length());
        }
    }
}
