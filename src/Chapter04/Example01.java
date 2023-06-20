package Chapter04;

import java.util.Scanner;
/*
 * 编写程序统计一个字符子串在一个字符串中出现的次数和位置。
 * 如子字符串“nba”在字符串”asfasfnabaasdfnbasdnbasnbasdnbadfasdf”中出现的次数和出现的位置。
 */
public class Example01 {
    public static void main(String[] args) {
        String str;
        String op;
        int sum = 0;
        Scanner cin = new Scanner(System.in);
        str = cin.nextLine();
        op = cin.nextLine();
        for(int i = 0; i < str.length() - op.length(); i++) {
            if(str.startsWith(op, i)){
                sum++;
                System.out.println("出现位置：" + i);
            }
        }
        System.out.println("出现次数：" + sum);
    }
}
