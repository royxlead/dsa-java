package Recursion.Questions.Basics;

public class Pallindrome {

    static boolean checkPallindrome(String str, int left, int right){
        if(left >= right){
            return true;
        }
        if(str.charAt(left) != str.charAt(right)){
            return false;
        }
        return checkPallindrome(str, left + 1, right - 1);
    }
    public static void main(String[] args) {
        String str = "madam";
        boolean isPallindrome = checkPallindrome(str, 0, str.length() - 1);
        if (isPallindrome) {
            System.out.println(str + " is a pallindrome");
        } else {
            System.out.println(str + " is not a pallindrome");
        }
    }
}
