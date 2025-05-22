package BinarySearch.InterviewQuestions;

public class FindInMountainArray {

    static int findInMountainArray(int[] arr, int target){
        int peak = peakIndexInMountainArray(arr);
        int leftSearch = binarySearch(arr, target, 0, peak);
        if(leftSearch != -1){
            return leftSearch;
        }
        return binarySearch(arr, target, peak + 1, arr.length - 1); 
    }
    static int peakIndexInMountainArray(int[] arr){
        int left = 0;
        int right = arr.length - 1;

        while(left < right){
            int mid = left + (right - left) / 2;

            if(arr[mid] < arr[mid +1]){
                left = mid + 1;
            } else{
                right = mid;
            }
        }
        return left;
    }
    static int binarySearch(int[] arr, int target, int left, int right){
        while(left <= right){
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
        int[] arr = {1,2,3,4,5,3,1};
        int target = 3;
        int result = findInMountainArray(arr, target);
        System.out.println("The index of " + target + " is: " + result);
    }
}
