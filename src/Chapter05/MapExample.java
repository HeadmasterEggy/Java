package Chapter05;

import java.util.HashMap;
import java.util.Map;

/*
 * 请用Map实现获取字符串“bwaerbctyxbacecrtdcvr”中每一个字母出现的次数。要求结果格式：a(2)b(3)c(4)…..
 */
public class MapExample {
    public static void main(String[] args) {
        String s = "bwaerbctyxbacecrtdcvr";
        Map<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        StringBuilder result = new StringBuilder();
        for(char c : map.keySet()){
            result.append(c).append("(").append(map.get(c)).append(")");
        }
        System.out.println(result);
    }
}