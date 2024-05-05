public class ActivationFunction {
    // Returns the Heaviside function of x.
    public static double heaviside(double x) {
        if (Double.isNaN(x)) return Double.NaN;
        else if (x < 0.0) return 0.0;
        else if (x > 0.0) return 1.0;
        else return 0.5;
    }

    // Returns the sigmoid function of x.
    public static double sigmoid(double x) {
        return 1 / (1 + Math.exp(-x));
    }

    // Returns the hyperbolic tangent of x.
    public static double tanh(double x) {
        // double out = (Math.exp(x) - Math.exp(-x)) / (Math.exp(x) + Math.exp(-x));
        return Math.tanh(x);
    }

    // Returns the softsign function of x.
    public static double softsign(double x) {
        return x / (1 + Math.abs(x));
    }

    // Returns the square nonlinearity function of x.
    public static double sqnl(double x) {
        double result = 0;
        if (x <= -2.0) result = -1.0;
        else if (x > -2.0 && x < 0.0) result = x + ((x * x) / 4);
        else if (x >= 0.0 && x < 2.0) result = x - ((x * x) / 4);
        else if (x >= 2.0) result = 1.0;
        return result;
    }

    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);

        StdOut.printf("heaviside(%f) = %f\n", x, heaviside(x));
        StdOut.printf("sigmoid(%f) = %f\n", x, sigmoid(x));
        StdOut.printf("tanh(%f) = %f\n", x, tanh(x));
        StdOut.printf("softsign(%f) = %f\n", x, softsign(x));
        StdOut.printf("sqnl(%f) = %f\n", x, sqnl(x));
    }
}
