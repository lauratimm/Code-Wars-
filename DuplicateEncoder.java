import java.util.HashMap;
import java.util.Map;

public class DuplicateEncoder {
    static String encode(String word) {
        word = word.toLowerCase();
        char[] chars = word.toCharArray();
        StringBuilder sb = new StringBuilder("");

        Map<Character, String> map = new HashMap<>();
        for (char c : chars) {
            if (map.containsKey(c)) {
                map.put(c, ")");
            } else {
                map.put(c, "(");
            }
        }
        for (char c : chars) {
            sb.append(map.get(c));
        }
        word = sb.toString();

        return word;
    }
}


