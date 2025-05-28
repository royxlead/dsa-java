package Recursion.Questions.Basics;

public class CountZeros {
    static int countZeros(int n){
        if(n == 0){
            return 1;
        }
        if(n < 10){
            return n;
        }
        return (n % 10 == 0 ? 1 : 0) + countZeros(n / 10);
    }
    public static void main(String[] args) {
        int n = 1002003;
        System.out.println("Count of zeros in " + n + " is: " + countZeros(n));
    }
}
