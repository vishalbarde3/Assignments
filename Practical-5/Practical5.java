public class Practical5 {

    public static int factorialForLoop(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static int factorialWhileLoop(int n) {
        int result = 1;
        int i = 1;
        while (i <= n) {
            result *= i;
            i++;
        }
        return result;
    }

    public static int factorialRecursion(int n) {
        if (n<2) {
            return 1;
        }
        return n * factorialRecursion(n - 1);
    }

    public static int sumOfArrayRecursion(int[] arr, int index) {
        if (index == arr.length) {
            return 0;
        }
        return arr[index] + sumOfArrayRecursion(arr, index + 1);
    }

    public static void main(String[] args) {
        int number = 1;
        System.out.println("Factorial using for loop: " + factorialForLoop(number));
        System.out.println("Factorial using while loop: " + factorialWhileLoop(number));
        System.out.println("Factorial using recursion: " + factorialRecursion(number));

        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Sum of array using recursion: " + sumOfArrayRecursion(array, 0));
    }
}
