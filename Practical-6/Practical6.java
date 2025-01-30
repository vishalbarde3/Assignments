public class Practical6 {

    // First Pattern
    public static void displayPattern1(int size) {
        for (int ln = 1; ln <= size; ln++) {
            for (int space = size; space > ln; space--) {
                System.out.print(" ");
            }
            for (int star = 1; star <= ln; star++) {
                System.out.print("+ ");
            }
            System.out.println();
        }

        for (int ln = size - 1; ln >= 1; ln--) {
            for (int space = size; space > ln; space--) {
                System.out.print(" ");
            }
            for (int star = 1; star <= ln; star++) {
                System.out.print("+ ");
            }
            System.out.println();
        }
    }

    // Second Pattern
    public static void displayPattern2(int size) {
        for (int ln = 1; ln <= size; ln++) {
            for (int space = size; space > ln; space--) {
                System.out.print(" ");
            }
            for (int star = 1; star <= ln; star++) {
                System.out.print("+ ");
            }
            System.out.println();
        }

        for (int ln = size - 1; ln >= 1; ln--) {
            for (int space = size; space > ln; space--) {
                System.out.print(" ");
            }
            for (int star = 1; star <= ln; star++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Third Pattern
    public static void displayPattern3(int size) {
        for (int ln = 1; ln <= size; ln++) {
            for (int space = size - ln; space > 0; space--) {
                System.out.print(" ");
            }
            for (int symbol = 1; symbol <= 2 * ln - 1; symbol++) {
                if ((symbol + ln) % 2 == 0) {
                    System.out.print("*");
                } else {
                    System.out.print("+");
                }
            }
            System.out.println();
        }

        for (int ln = size; ln >= 1; ln--) {
            for (int space = size - ln; space > 0; space--) {
                System.out.print(" ");
            }
            for (int symbol = 1; symbol <= 2 * ln - 1; symbol++) {
                if ((symbol + ln) % 2 == 0) {
                    System.out.print("+");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int size = 3;

        System.out.println("Pattern 1:");
        displayPattern1(size);

        System.out.println("\nPattern 2:");
        displayPattern2(size);

        System.out.println("\nPattern 3:");
        displayPattern3(size);
    }
}
