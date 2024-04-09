/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World");
        System.out.println("Hello, Software Engineer");

        int n = 123456789;
        int m = 0;
        while (n != 0) {
            m = (10 * m) + (n % 10);
            n = n / 10;
        }
        System.out.println(m);
        for (int i = 0, j = 0; i < 10; i++) {
            j += i;
            System.out.println(j);
        }
    }
}
