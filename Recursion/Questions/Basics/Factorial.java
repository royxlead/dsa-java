package Recursion.Questions.Basics;

public class Factorial {

    static int factorial(int n){
        if (n == 0 || n == 1){
            return 1;
        }
        return n * factorial(n - 1);
    }
    public static void main(String[] args) {
        System.out.println("Factorial of 5 is: " + factorial(5));
    }
}
