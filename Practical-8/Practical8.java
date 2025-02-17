class Practical8 {

    // First Pattern
    void generatePattern1(int line, int size) {
        if (line > size + 1) return;

        drawStars(line);
        System.out.println();

        generatePattern1(line + 1, size);

        drawStars(line - 1);
        System.out.println();
    }

    // Second Pattern
    void pattern2(int line, int size) {
        if (line > (size / 2) + 1) return;

        System.out.print("  ".repeat(((size / 2) + 1) - line));
        System.out.println("* ".repeat(2 * line - 1));

        pattern2(line + 1, size);
        if (line < (size / 2) + 1) {
            System.out.print("  ".repeat(((size / 2) + 1) - line));
            System.out.println("* ".repeat(2 * line - 1));
        }

        if (line == 1) {
            for (int i = 0; i < size; i++) {
                System.out.println("  ".repeat(size / 2) + "+");
            }
        }
    }

    // Third Pattern
    void pattern3(int line, int size) {
        if (line <= size) {
            System.out.println(" ".repeat((size + 1) - line) + "*".repeat(line));
            pattern3(line + 1, size); // Recursive call
            System.out.println(" ".repeat((size + 1) - line) + "/".repeat(line));
        }
    }

    // Fourth Pattern
    void pattern4(int line, int size) {
        if (line < size + 1) {
            System.out.print("  ".repeat(size - line));
            if (line % 2 == 0) {
                System.out.println("/ ".repeat(2 * line - 1));
            } else {
                System.out.println("* ".repeat(2 * line - 1));
            }

            pattern4(line + 1, size);

            System.out.print("  ".repeat(size - line));
            if (line % 2 != 0) {
                System.out.println("/ ".repeat(2 * line - 1));
            } else {
                System.out.println("* ".repeat(2 * line - 1));
            }
        }
    }

    // Utility function to print stars
    void drawStars(int count) {
        if (count > 0) {
            System.out.print("*");
            drawStars(count - 1);
        }
    }

    public static void main(String[] args) {
        Practical8 p = new Practical8();

        System.out.println("Pattern 1:");
        p.generatePattern1(1, 3);

        System.out.println("\nPattern 2:");
        p.pattern2(1, 5);

        System.out.println("\nPattern 3:");
        p.pattern3(1, 3);

        System.out.println("\nPattern 4:");
        p.pattern4(1, 5);
    }
}
