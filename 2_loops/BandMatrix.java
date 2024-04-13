/* *****************************************************************************
 *  Name:              Jason Lima
 *  Coursera User ID:  123456
 *  Last modified:     April 09, 2024
 **************************************************************************** */

public class BandMatrix {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int w = Integer.parseInt(args[1]);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (Math.abs(i - j) <= w) {
                    System.out.print("*");
                } else {
                    System.out.print("0");
                }
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}
