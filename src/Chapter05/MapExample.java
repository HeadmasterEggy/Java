package Chapter05;
import java.util.*;
/*
 * 请用Map实现获取字符串“bwaerbctyxbacecrtdcvr”中每一个字母出现的次数。要求结果格式：a(2)b(3)c(4)…..
 */
public class MapExample {
    public static void main(String[] args) {
        String s = "bwaerbctyxbacecrtdcvr";
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!map.containsKey(c)) {
                map.put(c, 1);
            } else {
                int count = map.get(c);
                map.put(c, count + 1);
            }
        }
        StringBuilder result = new StringBuilder();
        for (char c : map.keySet()) {
            result.append(c).append("(").append(map.get(c)).append(")");
        }
        System.out.println(result);
    }
}