import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountingDuplicates {
    public static int duplicateCount(String text) {
        text = text.toLowerCase();
        System.out.println(text);
        int count = 0;
        Map<Character, Integer> map = new HashMap<Character, Integer>();

        for (int i = 0; i < text.length(); i++) {
            for (int j = 1; i < text.length() - 1; i++) {
                if (text.charAt(i) == (text.charAt(j))) {
                    count++;
                    if(map.equals(text.charAt(i))){
                        map.replace(text.charAt(i), count);
                    }
                    else{map.put(text.charAt(i), count);}

                    System.out.println(text.charAt(i));
                }
                count = 0;
            }
        }
        System.out.println(map);
        return map.size();
    }
}