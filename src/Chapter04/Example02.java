package Chapter04;

import java.util.Arrays;

/*
 * 对字符串“23 10 -8 0 3 7 108”中的数值进行升序排序，生成一个数值有序的字符串“-80371023108”。
 */
public class Example02 {
    public static void main(String[] args) {
        String str = "23 10 -8 0 3 7 108";
        String[] strArray = str.split(" ");
        int[] num = new int[strArray.length];
        for (int i = 0; i < num.length; i++) {
            num[i] = Integer.parseInt(strArray[i]);
        }
        Arrays.sort(num);
        StringBuilder res = new StringBuilder();
        for (int i : num) {
            res.append(i);
        }
        System.out.println(res.toString());
    }
}
