public class Factorial {

        public int factorial(int n) {
            if (n == 0) {
                return 1;
            }
            if (n > 0 && n < 12) {
                return n * factorial(n - 1);

            } else {
                throw new IllegalArgumentException("n must be between 0 and 12");
            }
        }
    }
