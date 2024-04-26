public class ThueMorse {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int[] seq = new int[n];

        seq[0] = 0; // Initial value

        for (int i = 1; i < n; i++) {
            if (Integer.bitCount(i) % 2 == 0) {
                seq[i] = seq[i / 2];
            } else {
                seq[i] = 1 - seq[i - 1];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // if bits of i and j are equal
                if (Integer.bitCount(i ^ j) % 2 == 0) {
                    System.out.print("+  ");
                } else {
                    System.out.print("-  ");
                }
            }
            System.out.println();
        }
    }
}
