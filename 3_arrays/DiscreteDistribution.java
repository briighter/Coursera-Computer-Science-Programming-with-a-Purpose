public class DiscreteDistribution {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int[] argsArray = new int[args.length - 1];
        int[] cumulativeSum = new int[args.length];

        // Initialize array
        for (int i = 0; i < args.length - 1; i++) {
            argsArray[i] = Integer.parseInt(args[i + 1]);
        }
        // argsArray = [1, 1, 1, 1, 1, 1]
        // length = 6

        // Get Cumulative Sum
        for (int i = 0; i < argsArray.length; i++) {
            cumulativeSum[i + 1] = cumulativeSum[i] + argsArray[i];
        }
        // [0, 1, 2, 3, 4, 5, 6] || [0, 10, 20, 30, 40, 50, 100]

        for (int i = 0; i < m; i++) {
            int random = cumulativeSum[(int) Math.floor(Math.random() * cumulativeSum.length)];
            for (int j = 1; j < cumulativeSum.length; j++) {
                if (random >= cumulativeSum[j - 1] && random < cumulativeSum[j]) {
                    System.out.print(j + " ");
                    break;
                }
            }
        }
        System.out.println();
    }
}
