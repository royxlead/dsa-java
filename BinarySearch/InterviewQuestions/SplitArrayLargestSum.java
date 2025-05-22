package BinarySearch.InterviewQuestions;

public class SplitArrayLargestSum {

    static boolean isValid(int[] arr, int m, int mid){
        int sum = 0;
        int count = 1;

        for(int i = 0; i < arr.length; i++){
            sum += arr[i];

            if(sum > mid){
                count++;
                sum = arr[i];

                if(count > m){
                    return false;
                }
            }
        }
        return true;
    }
    static int splitArray(int[] arr, int m){
        int left = 0;
        int right  = 0;

        for(int i = 0; i < arr.length; i++){
            left = Math.max(left, arr[i]);
            right += arr[i];
        }
        int result = right;
        while(left <= right){
            int mid = left + (right - left) / 2;

            if(isValid(arr, m, mid)){
                result = Math.min(result, mid);
                right = mid - 1;
            } else{
                left = mid + 1;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {7, 2, 5, 10, 8};
        int m = 2;
        System.out.println("The minimum largest sum is: " + splitArray(arr, m));
    }
}
