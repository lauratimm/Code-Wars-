import com.sun.deploy.util.StringUtils;

import java.util.HashMap;
import java.util.Map;

public class letterCount {

    public static void count(String str) {
        //new hash map
        Map<Character, Integer> letters = new HashMap<>();

        //add each letter to the map
        // if not in map value = 1, if it is there already increase the value by 1
        for(char c : str.toCharArray()){

            if (letters.containsKey(c)){
                int num = letters.get(c);
                letters.replace(c, num, num+1);
            }
            else {
                letters.put(c,1);
            }
        }

        //for each item in the map print the Key: # of * (* number = value)
        letters.forEach((key, value) -> {
            //this seems silly is there a better way?
            String repeatedStar = new String(new char[value]).replace('\0', '*');
            System.out.print(key + ": " + repeatedStar + ", ");

        });
    }

    //this is just for testing the function
    public static void main(String[] args) {
        String str = "abcbbc";
        count(str);

    }
}
