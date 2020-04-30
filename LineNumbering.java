import java.util.*;

public class LineNumbering {
    public static List<String> number(List<String> lines) {
        List<String> number = new ArrayList<>();
        int i = 1;
        for (String string : lines){
            number.add(i + ": " + string);
            i++;
        }
        return number;
    }
}