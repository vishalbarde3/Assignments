import java.util.Scanner;

class Practical7 {
    
    // Function to generate 'V'
    String displayV(int row, int size) {
        String symbol = "";
        for (int col = 1; col <= size ; col++) {
            if (col == 1 && row < size || col == size && row < size || (row == size && col > 1 && col < size)) 
                symbol += "* ";
            else 
                symbol += "  ";
        }
        return symbol;
    }

    // Function to generate 'I'
    String displayI(int row, int size) {
        String symbol = "";
        for (int col = 1; col <= size; col++) {
            if (row == 1 || row == size || col == size / 2 + 1)
                symbol += "* ";
            else 
                symbol += "  ";
        }
        return symbol;
    }

    // Function to generate 'S'
    String displayS(int row, int size) {
    String symbol = "";
    for (int col = 1; col <= size; col++) {
        if (row == 1 || row == size || row == size / 2 + 1 || (col == 1 && row <= size / 2) || (col == size && row >= size / 2 + 1)) {
            symbol += "* ";
        }
        else {
            symbol += "  "; 
        }
    }
    return symbol;
   }



    // Function to generate 'H'
    String displayH(int row, int size) {
        String symbol = "";
        for (int col = 1; col <= size; col++) {
            if (col == 1 || col == size || row == size / 2 + 1)
                symbol += "* ";
            else 
                symbol += "  ";
        }
        return symbol;
    }

    // Function to generate 'A'
    String displayA(int row, int size) {
        String symbol = "";
        for (int col = 1; col <= size; col++) {
            if (col == 1 || col == size || row == size / 2 + 1|| (row == 1 && col > 1 && col < size)) 
                symbol += "* ";
            else 
                symbol += "  ";
        }
        return symbol;
    }

    // Function to generate 'L'
    String displayL(int row, int size) {
        String symbol = "";
        for (int col = 1; col <= size; col++) {
            if (col == 1 || row == size) 
                symbol += "* ";
            else 
                symbol += "  ";
        }
        return symbol;
    }

    // Main method
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = scanner.nextInt();
        scanner.close();

        Practical7 obj = new Practical7();

        for (int row = 1; row <= size; row++) {
            System.out.println(obj.displayV(row, size) + "  " +
                               obj.displayI(row, size) + "  " +
                               obj.displayS(row, size) + "  " +
                               obj.displayH(row, size) + "  " +
                               obj.displayA(row, size) + "  " +
                               obj.displayL(row, size));
        }
    }
} 
