package BinarySearch.InterviewQuestions;

public class RotationCountInRotatedSortedArray {
    static int countRotations(int[] arr){
        int rotate = findPivot(arr);
        return rotate;
    }
    static int findPivot(int[] arr){
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if(arr[mid] > arr[right]){
                left = mid + 1;
            } else{
                right = mid;
            }
        }
        return left;
    }
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int result = countRotations(arr);
        System.out.println("The array is rotated " + result + " times.");
    }
}
