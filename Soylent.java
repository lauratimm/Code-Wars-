import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Soylent {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int testCase = scan.nextInt();

        for (int i = 0; i < testCase; i++) {
            int calories = scan.nextInt();
            System.out.println((int)Math.ceil(calories / 400.0));
        }

        scan.close();
    }
}
