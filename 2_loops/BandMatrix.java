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

        int[] b = { 1, 2, 3 };
        int[] c = b;
        c[0] += b[2];
        c[1] += b[1];
        c[2] += b[0];
        System.out.println(c[0] + c[1] + c[2]);

        int[] a = new int[10];

        for (int i = 0; i < 10; i++)
            a[i] = 9 - i;

        for (int i = 0; i < 10; i++)
            a[i] = a[a[i]];

        System.out.println(a[5]);
        int[] d = new int[100];
    }
}
