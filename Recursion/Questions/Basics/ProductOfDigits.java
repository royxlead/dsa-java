package Recursion.Questions.Basics;

public class ProductOfDigits {
    static int productOfDigits(int n){
        if(n == 0) {
            return 1;
        }
        return (n % 10) * productOfDigits(n / 10);
    }
    public static void main(String[] args) {
        int n = 1234;
        System.out.println("Product of digits of " + n + " is: " + productOfDigits(n));
    }
}
