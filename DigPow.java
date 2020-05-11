public class DigPow {

    public static long digPow(int n, int p) {
        int count = String.valueOf(n).length()-1 + p;
        int sum = 0;
        int temp = n;

        while (count >= p) {
            sum += Math.pow((temp % 10),count--);
            temp = temp / 10;
        }

        if(sum % n == 0){
            return sum / n;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(digPow(89, 1));
    }
}
