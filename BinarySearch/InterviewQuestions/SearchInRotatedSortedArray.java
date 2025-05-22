package BinarySearch.InterviewQuestions;

public class SearchInRotatedSortedArray {

    static int binarySearch(int[] arr, int target, int left, int right){
        while(left <= right){
            int mid = left + (right - left) / 2;

            if(arr[mid] == target){
                return mid;
            } else if(arr[mid] < target){
                left = mid + 1;
            } else{
                right = mid - 1;
            }
        }
        return -1;
    }

    static int findPivot(int[] arr, int target){
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if(arr[mid] > arr[mid + 1]){
                return mid;
            } else if(arr[mid] < arr[mid - 1]){
                return mid - 1;
            } else if(arr[left] >= arr[mid]){
                right = mid - 1;
            } else{
                left = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int target = 0;
        int pivot = findPivot(arr, target);
        if(pivot == -1){
            System.out.println("The array is not rotated");
        } else {
            System.out.println("The pivot index is: " + pivot);
        }
        // Now we can search in the two halves
        int leftSearch = binarySearch(arr, target, 0, pivot);
        if(leftSearch != -1){
            System.out.println("The target is found at index: " + leftSearch);
        } else {
            int rightSearch = binarySearch(arr, target, pivot + 1, arr.length - 1);
            if(rightSearch != -1){
                System.out.println("The target is found at index: " + rightSearch);
            } else {
                System.out.println("The target is not found in the array");
            }
        }
    }
}
