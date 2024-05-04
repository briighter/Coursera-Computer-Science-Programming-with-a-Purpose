public class WorldMap {
    public static void main(String[] args) {
        // Get width & height
        int width = StdIn.readInt();
        int height = StdIn.readInt();
        StdDraw.setCanvasSize(width, height);   // 1000, 619

        // to speed up performance, defer displaying points
        StdDraw.enableDoubleBuffering();

        while (!StdIn.isEmpty()) {
            // Get name of verticies
            String state = StdIn.readString();      // HI
            // Get number of verticies
            int numVerticies = StdIn.readInt();     // 5

            // Initialize arrays
            double[] arrPX = new double[numVerticies];
            double[] arrPY = new double[numVerticies];

            for (int i = 0; i < numVerticies; i++) {
                // Get polygon coordinates
                double px = StdIn.readDouble();
                double py = StdIn.readDouble();
                // Push to double arr
                arrPX[i] = px;
                arrPY[i] = py;
            }
            StdDraw.polygon(arrPX, arrPY);
        }
        StdDraw.show();
    }
}
