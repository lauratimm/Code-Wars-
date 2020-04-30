import java.util.Scanner;

public class ValidShape {


    public static boolean isValidShape(int[] sideLengths, int numOfSides) {
        boolean result = true;
        int sum = 0;

        for (int j = 0; j < sideLengths.length; j++) {
            sum += sideLengths[j];
        }

        for (int i = 0; i < sideLengths.length; i++) {

            if (sideLengths[i] > (sum - sideLengths[i])) {
                result = false;
            }

        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of sizes:");
        int numOfSides = scan.nextInt();
        int sideLengths[] = new int[numOfSides];
        System.out.println("Enter the side lengths:");
        for (int i = 0; i < numOfSides; i++) {
            sideLengths[i] = scan.nextInt();
        }

        boolean valid = isValidShape(sideLengths, numOfSides);
        if (valid) {
            System.out.println("This shape is a valid shape");
        } else {
            System.out.println("This shape is a invalid");
        }
    }


}

