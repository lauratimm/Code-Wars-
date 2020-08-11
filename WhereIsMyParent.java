import java.util.Arrays;

//this is not my solution
//Code wars solution -- using for reference
class WhereIsMyParent {
    static String findChildren(final String text) {
        String[] sorted = text.split("");
        Arrays.sort(sorted);
        Arrays.sort(sorted, String.CASE_INSENSITIVE_ORDER);
        return String.join("", sorted);
    }


    public static void main(String[] args) {
        System.out.println(findChildren("aabaBA"));
    }
}
