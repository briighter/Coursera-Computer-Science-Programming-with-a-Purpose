public class Minesweeper {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]); // Number of rows
        int n = Integer.parseInt(args[1]); // Number of columns
        int k = Integer.parseInt(args[2]); // Number of mines

        // Create the minesweeper grid
        char[][] grid = new char[m][n];

        // Initialize the grid with zeros
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = '0';
            }
        }

        // Place the mines randomly
        for (int i = 0; i < k; i++) {
            int row, col;
            do {
                row = (int) (Math.random() * m);
                col = (int) (Math.random() * n);
            } while (grid[row][col] == '*');

            grid[row][col] = '*';
        }

        // Update the neighboring mine counts
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '*') {
                    continue;
                }

                int count = 0;
                for (int row = i - 1; row <= i + 1; row++) {
                    for (int col = j - 1; col <= j + 1; col++) {
                        if (row >= 0 && row < m && col >= 0 && col < n && grid[row][col] == '*') {
                            count++;
                        }
                    }
                }

                grid[i][j] = (char) (count + '0');
            }
        }

        // Print the minesweeper grid
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(grid[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
