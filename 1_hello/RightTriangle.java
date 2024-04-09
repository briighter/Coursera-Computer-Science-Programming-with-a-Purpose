/* *****************************************************************************
 *  Name:              Jason Lima
 *  Coursera User ID:  123456
 *  Last modified:     April 1, 2024
 **************************************************************************** */

public class RightTriangle {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        int max = Math.max(Math.max(a, b), c);
        int sumOfSquares = a * a + b * b + c * c - max * max;

        boolean isRightTriangle = sumOfSquares == max * max;

        System.out.println(isRightTriangle);
    }
}
