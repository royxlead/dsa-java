package BinarySearch.InterviewQuestions;

public class CeilingOfANumber {
    static int ceiling(int[] arr, int target){
        int left  =  0;
        int right = arr.length - 1;

        while(left <= right){
            int mid = left + (right - left) / 2;

            if(target < arr[mid]){
                right = mid - 1;
            } else if(target > arr[mid]){
                left = mid + 1;
            } else {
                return mid;
            }
        }

        return left;
    }
    public static void main(String[] args){
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 15;
        int result = ceiling(arr, target);
        if(result == arr.length){
            System.out.println("Ceiling of " + target + " is not found");
        } else {
            System.out.println("Ceiling of " + target + " is " + arr[result]);
        }
    }
}
