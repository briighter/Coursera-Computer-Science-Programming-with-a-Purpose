public class ShannonEntropy {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        double h = 0;
        int[] inputs = StdIn.readAllInts();
        int inputLength = inputs.length;

        for (int i = 1; i <= m; i++) {
            int count = 0;
            for (int item : inputs) {
                if (item == i) {
                    count++;
                }
            }
            double probability = count / (double) inputLength;
            h += -(probability * (Math.log(probability) / Math.log(2)) * probability);
        }

        System.out.printf("%.4f\n", h);
    }
}
