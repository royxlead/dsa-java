package BinarySearch.InterviewQuestions;

public class PositionOfAnElementInASortedArrayOfInfiniteNumbers {

    static int position(int[] arr, int target){
        int left = 0;
        int right = 1;

        while(target > arr[right]){
            left = right;
            right = right * 2;
        }
        return search(arr, target, left, right);
    }

    static int search(int[] arr, int target, int left, int right){
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if(target < arr[mid]){
                right = mid - 1;
            } else if(target > arr[mid]){
                left = mid + 1;
            } else{
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 5;
        int result = position(arr, target);
        System.out.println("Position of " + target + " is: " + result);
    }
}