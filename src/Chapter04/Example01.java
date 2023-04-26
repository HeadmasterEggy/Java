package Chapter04;

import java.util.Scanner;
/*
 * 编写程序统计一个字符子串在一个字符串中出现的次数和位置。
 * 如子字符串“nba”在字符串”asfasfnabaasdfnbasdnbasnbasdnbadfasdf”中出现的次数和出现的位置。
 */
public class Example01 {
     public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    // 输入字符串
    System.out.print("请输入一个字符串: ");
    String str = input.nextLine().trim();

    // 输入字符子串
    System.out.print("请输入要统计的字符子串: ");
    String subStr = input.nextLine().trim();

    // 统计字符子串出现的次数和位置
    int count = 0;
    int index = str.indexOf(subStr);
    while (index >= 0) {
      count++;
      System.out.printf("字符子串出现在位置 %d%n", index);
      index = str.indexOf(subStr, index + 1);
    }

    // 输出结果
    System.out.printf("共计出现了 %d 次", count);

    input.close();
  }
}
