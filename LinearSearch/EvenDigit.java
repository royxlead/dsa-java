package LinearSearch;

public class EvenDigit {
    public static void main(String[] args) {
        int[] arr = {12, 345, 2, 6, 7896};
        System.out.println("The number of even digits are" + countEvenDigit(arr));
    }
    // count the number of even digit numbers in the array
    static int countEvenDigit(int[] arr){
        if(arr.length == 0) return 0;
        int count = 0;
        for(int num : arr){
            if(evenDigit(num)){
                count++;
            }
        }
        return count;
    }
    // check if the number of digits in a number is even
    static boolean evenDigit(int num){
        int digit = countDigit(num);
        return digit % 2 == 0;
    }
    // count the number of digits in a number
    static int countDigit(int num){
        if(num < 0) num *= -1;
        if(num == 0) return 1;

        int count = 0;
        while(num > 0){
            count++;
            num /= 10;
        }
        return count;
    }
    // using log10
    static int countDigit2(int num){
        if(num < 0) num *= -1;
        if(num == 0) return 1;

        return (int)(Math.log10(num)) + 1;
    }
}
