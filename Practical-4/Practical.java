import java.util.Scanner;

public class Practical {

    // Decimal to Binary
    private static String decimalToBinary(String decimal) {
        int num = Integer.parseInt(decimal);
        StringBuilder binary = new StringBuilder();
        while (num > 0) {
            binary.insert(0, num % 2);
            num = num / 2;
        }
        return binary.length() > 0 ? binary.toString() : "0";
    }

    // Decimal to Octal
    private static String decimalToOctal(String decimal) {
        int num = Integer.parseInt(decimal);
        StringBuilder octal = new StringBuilder();
        while (num > 0) {
            octal.insert(0, num % 8);
            num = num / 8;
        }
        return octal.length() > 0 ? octal.toString() : "0";
    }

    // Decimal to Hexadecimal
    private static String decimalToHexadecimal(String decimal) {
        int num = Integer.parseInt(decimal);
        StringBuilder hex = new StringBuilder();
        char[] hexChars = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        while (num > 0) {
            hex.insert(0, hexChars[num % 16]);
            num = num / 16;
        }
        return hex.length() > 0 ? hex.toString() : "0";
    }

    // Binary to Decimal
    private static String binaryToDecimal(String binary) {
        int decimal = 0;
        int power = 0;
        for (int i = binary.length() - 1; i >= 0; i--) {
            if (binary.charAt(i) == '1') {
                decimal += Math.pow(2, power);
            }
            power++;
        }
        return Integer.toString(decimal);
    }

    // Binary to Octal
    private static String binaryToOctal(String binary) {
        return decimalToOctal(binaryToDecimal(binary));
    }

    // Binary to Hexadecimal
    private static String binaryToHexadecimal(String binary) {
        return decimalToHexadecimal(binaryToDecimal(binary));
    }

    // Octal to Decimal
    private static String octalToDecimal(String octal) {
        int decimal = 0;
        int power = 0;
        for (int i = octal.length() - 1; i >= 0; i--) {
            decimal += (octal.charAt(i) - '0') * Math.pow(8, power);
            power++;
        }
        return Integer.toString(decimal);
    }

    // Octal to Binary
    private static String octalToBinary(String octal) {
        return decimalToBinary(octalToDecimal(octal));
    }

    // Octal to Hexadecimal
    private static String octalToHexadecimal(String octal) {
        return decimalToHexadecimal(octalToDecimal(octal));
    }

    // Hexadecimal to Decimal
    private static String hexadecimalToDecimal(String hex) {
        int decimal = 0;
        int power = 0;
        hex = hex.toUpperCase();
        for (int i = hex.length() - 1; i >= 0; i--) {
            char ch = hex.charAt(i);
            int value = (ch >= '0' && ch <= '9') ? ch - '0' : ch - 'A' + 10;
            decimal += value * Math.pow(16, power);
            power++;
        }
        return Integer.toString(decimal);
    }

    // Hexadecimal to Binary
    private static String hexadecimalToBinary(String hex) {
        return decimalToBinary(hexadecimalToDecimal(hex));
    }

    // Hexadecimal to Octal
    private static String hexadecimalToOctal(String hex) {
        return decimalToOctal(hexadecimalToDecimal(hex));
    }

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("1. Byte");
        System.out.println("2. Short");
        System.out.println("3. Byte & Short");
        System.out.println("4. Number System Conversion");
        System.out.println("Enter the Preference: ");
        int pref = myObj.nextInt();

        switch (pref) {
            case 1 -> {
                System.out.println("Enter the number: ");
                int first = myObj.nextInt();
                int modulo = first % 128;
                int quotient = first / 128;

                if (quotient % 2 == 0) {
                    System.out.println(modulo);
                } else if (modulo > 0) {
                    System.out.println(modulo - 128);
                } else {
                    System.out.println(modulo + 128);
                }
            }
            case 2 -> {
                System.out.println("Enter the number: ");
                int first = myObj.nextInt();
                int modulo1 = first % 32768;
                int quotient1 = first / 32768;

                if (quotient1 % 2 == 0) {
                    System.out.println(modulo1);
                } else if (modulo1 > 0) {
                    System.out.println(modulo1 - 32768);
                } else {
                    System.out.println(modulo1 + 32768);
                }
            }
            case 3 -> {
                System.out.println("Enter the number: ");
                int first = myObj.nextInt();
                int modulo2 = first % 128;
                int quotient2 = first / 128;

                if (quotient2 % 2 == 0) {
                    System.out.println(modulo2);
                } else if (modulo2 > 0) {
                    System.out.println(modulo2 - 128);
                } else {
                    System.out.println(modulo2 + 128);
                }

                int modulo1 = first % 32768;
                int quotient1 = first / 32768;

                if (quotient1 % 2 == 0) {
                    System.out.println(modulo1);
                } else if (modulo1 > 0) {
                    System.out.println(modulo1 - 32768);
                } else {
                    System.out.println(modulo1 + 32768);
                }
            }
            case 4 -> {
                myObj.nextLine(); // Clear the buffer
                System.out.println("Enter the number: ");
                String number = myObj.nextLine();

                System.out.println("Enter the conversion type (e.g., binaryToOctal, decimalToBinary): ");
                String conversionType = myObj.nextLine().toLowerCase();

                String result = switch (conversionType) {
                    case "decimaltobinary" -> decimalToBinary(number);
                    case "decimaltooctal" -> decimalToOctal(number);
                    case "decimaltohexadecimal" -> decimalToHexadecimal(number);
                    case "binarytodecimal" -> binaryToDecimal(number);
                    case "binarytooctal" -> binaryToOctal(number);
                    case "binarytohexadecimal" -> binaryToHexadecimal(number);
                    case "octaltodecimal" -> octalToDecimal(number);
                    case "octaltobinary" -> octalToBinary(number);
                    case "octaltohexadecimal" -> octalToHexadecimal(number);
                    case "hexadecimaltodecimal" -> hexadecimalToDecimal(number);
                    case "hexadecimaltobinary" -> hexadecimalToBinary(number);
                    case "hexadecimaltooctal" -> hexadecimalToOctal(number);
                    default -> "Invalid conversion type!";
                };

                System.out.println("Result: " + result);
            }
            default -> System.out.println("Invalid preference!");
        }

        myObj.close();
    }
}
