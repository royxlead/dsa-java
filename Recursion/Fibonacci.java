package Recursion;

import java.util.Scanner;

public class Fibonacci {

    static int fibonacci(int n){
        if(n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to calculate Fibonacci: ");
        int n = scanner.nextInt();
        scanner.close();

        System.out.println("Fibonacci of " + n + " is: " + fibonacci(n));
    }
}
