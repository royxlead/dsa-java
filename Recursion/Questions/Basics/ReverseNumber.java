package Recursion.Questions.Basics;

public class ReverseNumber {
    static int reverseNumber(int n, int rev){
        if(n == 0) {
            return rev;
        }
        rev = rev * 10 + n % 10;
        return reverseNumber(n / 10, rev);
    }
    public static void main(String[] args) {
        int n = 1234;
        System.out.println("Reversed number of " + n + " is: " + reverseNumber(n, 0));
    }
}
