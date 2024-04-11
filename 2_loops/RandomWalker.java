public class RandomWalker {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int x = 0;
        int y = 0;
        int steps = 0;
        System.out.println("("+ x + ", " + y + ")");
        while (Math.abs(x) - Math.abs(y) != r) {
            double direction = Math.random();
            // Go north
            if(direction <= 0.25) {
                y += 1;
            }
            // Go south
            if(direction >= 0.75) {
                y -= 1;
            }
            // Go east
            if(0.25 < direction && direction < 0.50) {
                x += 1;
            }
            // Go west
            if(0.50 < direction && direction < 0.75) {
                x -= 1;
            }
            steps += 1;
            System.out.println("("+ x + ", " + y + ")");
        }
        System.out.println("steps = " + steps);
    }
}
