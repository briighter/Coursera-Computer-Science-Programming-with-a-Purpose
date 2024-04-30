public class ShannonEntropy {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        double h = 0.0;
        int[] inputs = new int[m];
        int totalCount = 0;

        // Read integers from standard input and count their frequencies
        while (!StdIn.isEmpty()) {
            int value = StdIn.readInt();
            if (value >= 1 && value <= m) {
                inputs[value - 1]++;
                totalCount++;
            }
        }

        for (int freq : inputs) {
            if (freq > 0) {
                double probability = (double) freq / totalCount;
                h -= probability * (Math.log(probability) / Math.log(2));
            }
        }

        System.out.printf("%.4f\n", h);
    }
}
