package Recursion.Questions.Basics;

public class CountSteps {
    static int countSteps(int n) {
        if (n == 0) {
            return 0;
        }
        return 1 + countSteps(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Number of steps to reduce " + n + " to 0 is: " + countSteps(n));
    }
}
