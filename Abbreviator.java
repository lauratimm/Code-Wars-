public class Abbreviator {

    public static String abbreviate(String string) {
        String[] splitStr = string.split("[-\\s]");
        StringBuilder sb = new StringBuilder();

        for (String element : splitStr) {
            if (element.length() >= 4) {
                sb.append(element.charAt(0));
                if (element.substring(1, element.length()-2).contains(",")) {
                    sb.append(element.substring(1, element.length()-2));
                }
                else {
                    sb.append(Integer.toString(element.length() - 2));
                }
                sb.append(element.charAt(element.length() - 1) + " ");
            } else {
                sb.append(element + " ");
            }
        }

        return sb.toString().trim();
    }

    public static void main(String[] args) {
        String str = "the5a, sits";
        String check = abbreviate(str);
        System.out.println(check);

    }

}