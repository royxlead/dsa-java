package BinarySearch.InterviewQuestions;

public class FirstAndLastPositionOfElement {

    static int[] searchRange(int[] arr, int target){
        int First = occurrence(arr, target, true);
        int Last = occurrence(arr, target, false);
        return new int[]{First, Last};
    }
    static int occurrence(int[] arr, int target, boolean isFirst){
        int left = 0;
        int right = arr.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if(target < arr[mid]){
                right = mid - 1;
            } else if(target > arr[mid]){
                left = mid + 1;
            } else{
                result = mid;
                if(isFirst){
                    right = mid - 1;
                } else{
                    left = mid + 1;
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 8, 8, 10};
        int target = 8;
        int[] result = searchRange(arr, target);
        System.out.println("First and last position of " + target + " is: [" + result[0] + ", " + result[1] + "]");
    }
}
