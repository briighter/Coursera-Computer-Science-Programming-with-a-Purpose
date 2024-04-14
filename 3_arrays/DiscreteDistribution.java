public class DiscreteDistribution {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int[] argsArray = new int[args.length - 1];
        int[] cumulativeSums;

        // Initialize array
        for (int i = 0; i < args.length - 1; i++) {
            argsArray[i] = Integer.parseInt(args[i + 1]);
        }

        // Get Cumulative Sum
//        for (int i = 0; i < argsArray.length; i++) {
//            cumulativeSum[i + 1] = cumulativeSum[i] + argsArray[i];
//        }
//
//        for (int i = 1; i < m; i++) {
//            int random = (int) Math.random() * argsArray.length;
//            if (argsArray[i - 1] <= random && random < argsArray[i]) {
//                System.out.println(i + " ");
//            }
//        }
    }
}
