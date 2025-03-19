import java.util.*;

 class SudokuGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter Sudoku grid size (e.g., 1, 2, 3...): ");
        int n = input.nextInt();

        int[][] answerGrid = new int[n][n];
        int[][] gameGrid = new int[n][n];
        boolean[][] editable = new boolean[n][n];

        // Fill the answer grid with random values
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                answerGrid[row][col] = random.nextInt(n) + 1;
                gameGrid[row][col] = answerGrid[row][col];
            }
        }

        // Hide 40% of the cells randomly
        int total = n * n;
        int emptyCells = (int)(total * 0.4);
        while (emptyCells > 0) {
            int r = random.nextInt(n);
            int c = random.nextInt(n);
            if (gameGrid[r][c] != 0) {
                gameGrid[r][c] = 0;
                editable[r][c] = true;
                emptyCells--;
            }
        }

        // Main game loop
        boolean isRunning = true;
        while (isRunning) {
            System.out.println("\nSudoku Puzzle:");
            displayGrid(gameGrid, n);

            System.out.println("\nChoose an action:");
            System.out.println("1. Add a number");
            System.out.println("2. Remove a number");
            System.out.println("3. Submit solution");
            System.out.print("Your choice: ");
            int option = input.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Row (1 to " + n + "): ");
                    int rowAdd = input.nextInt();
                    System.out.print("Column (1 to " + n + "): ");
                    int colAdd = input.nextInt();
                    System.out.print("Value (1 to " + n + "): ");
                    int val = input.nextInt();

                    if (isValid(rowAdd, colAdd, n) && editable[rowAdd - 1][colAdd - 1]) {
                        gameGrid[rowAdd - 1][colAdd - 1] = val;
                    } else {
                        System.out.println("⚠️ Invalid input or non-editable cell.");
                    }
                    break;

                case 2:
                    System.out.print("Row (1 to " + n + "): ");
                    int rowDel = input.nextInt();
                    System.out.print("Column (1 to " + n + "): ");
                    int colDel = input.nextInt();

                    if (isValid(rowDel, colDel, n) && editable[rowDel - 1][colDel - 1]) {
                        gameGrid[rowDel - 1][colDel - 1] = 0;
                    } else {
                        System.out.println("⚠️ Invalid input or non-editable cell.");
                    }
                    break;

                case 3:
                    System.out.println("\n🔍 Checking your solution...");
                    if (isCorrect(gameGrid, answerGrid)) {
                        displayGrid(gameGrid, n);
                        System.out.println("✅ Well done! Puzzle solved correctly.");
                    } else {
                        System.out.println("❌ Incorrect solution. Here's the correct one:");
                        displayGrid(answerGrid, n);
                    }
                    isRunning = false;
                    break;

                default:
                    System.out.println("❗ Please select a valid option.");
            }
        }

        input.close();
    }

    static boolean isValid(int r, int c, int limit) {
        return r >= 1 && r <= limit && c >= 1 && c <= limit;
    }

    static boolean isCorrect(int[][] user, int[][] answer) {
        int len = user.length;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (user[i][j] != answer[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    static void displayGrid(int[][] grid, int size) {
        int width = 3;
        String border = " ";
        for (int i = 0; i < size; i++) {
            border += "-".repeat(width) + " ";
        }

        for (int i = 0; i < size; i++) {
            System.out.println(border);
            for (int j = 0; j < size; j++) {
                System.out.print("|");
                if (grid[i][j] == 0) {
                    System.out.print(" ".repeat(width));
                } else {
                    System.out.printf("%" + width + "d", grid[i][j]);
                }
            }
            System.out.println("|");
        }
        System.out.println(border);
    }
}

