public class RandomWalker {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int x = 0;
        int y = 0;
        int steps = 0;
        double d1 = 0.25;
        double d2 = 0.50;
        double d3 = 0.75;
        System.out.println("("+ x + ", " + y + ")");
        while (Math.abs(x) - Math.abs(y) != r) {
            double direction = Math.random();
            // Go north
            if (direction <= d1) {
                y += 1;
            }
            // Go south
            if (direction >= d3) {
                y -= 1;
            }
            // Go east
            if (d1 < direction && direction < d2) {
                x += 1;
            }
            // Go west
            if (d2 < direction && direction < d3) {
                x -= 1;
            }
            steps += 1;
            System.out.println("("+ x + ", " + y + ")");
        }
        System.out.println("steps = " + steps);
    }
}
