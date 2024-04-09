/* *****************************************************************************
 *  Name:              Jason Lima
 *  Coursera User ID:  123456
 *  Last modified:     April 1, 2024
 **************************************************************************** */

public class GreatCircle {
    public static void main(String[] args) {
        double x1 = Math.toRadians(Double.parseDouble(args[0]));
        double y1 = Math.toRadians(Double.parseDouble(args[1]));
        double x2 = Math.toRadians(Double.parseDouble(args[2]));
        double y2 = Math.toRadians(Double.parseDouble(args[3]));
        double r = 6371.0; // The mean radius of the Earth (in kilometers)

        // Haversine formula
        double distance = 2 * r * Math.asin(
                Math.sqrt(Math.pow(Math.sin(((x2 - x1) / 2)), 2) + (Math.cos(x1) * Math.cos(x2)
                        * Math.pow(Math.sin(((y2 - y1) / 2)), 2))));

        System.out.println(distance + " kilometers");
    }
}
