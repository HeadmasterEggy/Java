package Chapter04;

import java.util.Arrays;
/*
 * 对字符串“23 10 -8 0 3 7 108”中的数值进行升序排序，生成一个数值有序的字符串“-80371023108”。
 */
public class Example02 {
    public static void main(String[] args) {

    String str = "23 10 -8 0 3 7 108"; // 待排序的字符串

    // 将字符串转换为数组
    String[] strArray = str.split(" "); // 按空格切割字符串
    int[] numArray = new int[strArray.length];
    for (int i = 0; i < strArray.length; i++) {
      numArray[i] = Integer.parseInt(strArray[i]); // 转换为整数
    }

    // 对数组进行升序排序
    Arrays.sort(numArray);

    // 生成一个数值有序的字符串
    StringBuilder result = new StringBuilder();
    for (int j : numArray) {
        result.append(j);
    }

    // 输出结果
    System.out.println("原始字符串：" + str);
    System.out.println("升序排序后的数组：" + Arrays.toString(numArray));
    System.out.println("生成的数值有序的字符串：" + result);
  }

}
