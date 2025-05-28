package Recursion.Questions.Basics;

public class NumberReturn {

    static void returnNumber(int n){
        if (n == 0) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        returnNumber(n - 1);
    }
    static void returnNumber2(int n){
        if (n == 0) {
            System.out.println(n);
            return;
        }
        returnNumber2(n - 1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        returnNumber(5);
        System.out.println("-----");
        returnNumber2(5);
    }
}