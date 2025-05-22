package BinarySearch.InterviewQuestions;

public class FloorOfANumber {

    static int floor(int[] arr, int target){
        int left = 0;
        int right = arr.length - 1;

        while(left <= right){
            int mid = left + (right - left) / 2;

            if(target < arr[mid]){
                right = mid - 1;
            } else if (target > arr[mid]){
                left = mid + 1;
            } else{
                return mid;
            }
        }

        return right;
    }
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 15;
        int result = floor(arr, target);
        if(result == -1){
            System.out.println("Floor of " + target + " is not found");
        } else {
            System.out.println("Floor of " + target + " is " + arr[result]);
        }
    }
}
