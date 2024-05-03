public class WorldMap {
    public static void main(String[] args) {
        // Get width & height
        int width = StdIn.readInt();
        int height = StdIn.readInt();
        StdDraw.setCanvasSize(width, height);   // 1000, 619

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
            StdDraw.polygon(arrPX,arrPY);

        }


        // Sample
        // // read in bounding box and rescale
        // double xmin = StdIn.readDouble();
        // double ymin = StdIn.readDouble();
        // double xmax = StdIn.readDouble();
        // double ymax = StdIn.readDouble();
        // StdDraw.setXscale(xmin, xmax);
        // StdDraw.setYscale(ymin, ymax);
        //
        // // to speed up performance, defer displaying points
        // StdDraw.enableDoubleBuffering();
        //
        // // plot points, one at a time
        // while (!StdIn.isEmpty()) {
        //     double x = StdIn.readDouble();
        //     double y = StdIn.readDouble();
        //     StdDraw.point(x, y);
        // }
        //
        // // display all the points
        // StdDraw.show();
    }
}
