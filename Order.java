import java.util.Hashtable;

public class Order {
    public static String order(String words) {
        Hashtable<String, String> newlist = new Hashtable<String, String>();
        String[] splitStr = words.trim().split("\\s+");

        for (String element : splitStr) {

            for (int i = 0; i < element.length(); i++) {
                if (element.charAt(i) >= 48 && element.charAt(i) <= 57) {
                    newlist.put(Character.toString(element.charAt(i)), element);
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 1; i<10; i++){
            if (newlist.containsKey(String.valueOf(i))) {
                sb.append(newlist.get(String.valueOf(i)) + " ");
            }
        }

        return sb.toString().trim();
    }

    public static void main(String[] args) {
        String str = "is2 Thi1s T4est 3a";
        String check = order(str);
        System.out.println(check);

    }
}



