public class Divisors {
    // Returns the greatest common divisor of a and b.
    public static int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Returns the least common multiple of a and b.
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    // Returns true if a and b are relatively prime; false otherwise.
    public static boolean areRelativelyPrime(int a, int b) {
        return gcd(a, b) == 1;
    }

    // Returns the number of integers between 1 and n that are
    // relatively prime with n.
    public static int totient(int n) {
        if (n <= 0) {
            return 0; // If n ≤ 0, ϕ(n) = 0
        }

        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (areRelativelyPrime(i, n)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);

        StdOut.printf("gcd(%d, %d) = %d\n", x, y, gcd(x, y));
        StdOut.printf("lcm(%d, %d) = %d\n", x, y, lcm(x, y));
        StdOut.printf("areRelativelyPrime(%d, %d) = %b\n", x, y, areRelativelyPrime(x, y));
        StdOut.printf("totient(%d) = %d\n", x, totient(x));
        StdOut.printf("totient(%d) = %d\n", y, totient(y));
    }
}
