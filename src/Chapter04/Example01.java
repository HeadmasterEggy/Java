package Chapter04;

import java.util.Scanner;
/*
 * 编写程序统计一个字符子串在一个字符串中出现的次数和位置。
 * 如子字符串“nba”在字符串”asfasfnabaasdfnbasdnbasnbasdnbadfasdf”中出现的次数和出现的位置。
 */
public class Example01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String subStr = input.nextLine();
        String str = input.nextLine();
        int sum = 0;
        int count = 0;
        int index = 0;
        int n = 0;
        while ((index = str.indexOf(subStr, index)) != -1) {
            count++;
            index += subStr.length();
            System.out.println("第" + ++n + "次出现的位置：" + index);
        }
        System.out.println("字符串出现" + n + "次");
    }
}
