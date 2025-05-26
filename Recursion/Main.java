package Recursion;

public class Main {
    public static void main(String[] args) {
        System.out.println("Recursion Example: Factorial Calculation");

        // Example: Recursive function to calculate factorial of a number
        int number = 5;
        int result = factorial(number);
        System.out.println("Factorial of " + number + " is: " + result);

        /**
         * Recursion is a programming technique where a method calls itself to solve a problem.
         * Each recursive call solves a smaller subproblem, and the recursion ends when a base case is reached.
         * 
         * Use Case: Calculating the factorial of a number.
         * Factorial(n) = n * Factorial(n-1), with Factorial(0) = 1 as the base case.
         */
    }

    public static int factorial(int n) {
        // Base case: factorial of 0 is 1
        if (n == 0) {
            return 1;
        }
        // Recursive case: n * factorial of (n-1)
        return n * factorial(n - 1);
    }
}
