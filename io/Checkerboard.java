import java.awt.Color;

public class Checkerboard {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        // x- and y-coordinates of the canvas range from 0 and n
        StdDraw.setScale(0, n);

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                if ((i + j) % 2 != 0) StdDraw.setPenColor(StdDraw.GRAY);
                else StdDraw.setPenColor(StdDraw.BLUE);
                StdDraw.filledSquare(i + 0.5, j + 0.5, 0.5);
            }
        }


    }
}
