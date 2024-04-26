public class Birthday {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]); // Number of days in a year
        int trials = Integer.parseInt(args[1]); // Number of trials
        int[] count = new int[n + 2]; // Count array to store the number of people for each trial
        int[] days = new int[n]; // Array to represent the days in a year

        for (int i = 0; i < trials; i++) {
            boolean[] hasBirthday = new boolean[n + 1]; // Array to check if a birthday has occurred

            int people = 0;
            while (true) {
                int birthday = (int) (Math.random() * n); // Generate a random birthday
                people++; // Increment the count of people

                // Check if the birthday has already occurred
                if (hasBirthday[birthday]) {
                    break;
                }

                hasBirthday[birthday] = true; // Mark the birthday as occurred
            }

            count[people]++; // Update the count of people for the current trial
        }

        double total = 0;
        for (int i = 1; i <= n + 1; i++) {
            total += count[i]; // Calculate the total number of trials
        }

        // Print the table
        double sum = 0;
        for (int i = 1; i <= n + 1; i++) {
            sum += count[i];
            double fraction = sum / total;
            System.out.printf("%d\t%d\t%.6f\n", i, count[i], fraction);

            // Stop printing when the fraction reaches or exceeds 50%
            if (fraction >= 0.5) {
                break;
            }
        }
    }
}
