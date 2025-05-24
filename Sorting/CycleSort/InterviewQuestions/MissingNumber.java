package Sorting.CycleSort.InterviewQuestions;

public class MissingNumber {

    static int missingNumber(int[] arr){
        int n = arr.length;
        int i = 0;

        while (i < n) {
            int correctPos = arr[i];

            if(arr[i] < n && arr[i] != arr[correctPos]){
                swap(arr, i, correctPos);
            } else {
                i++;
            }
        }
        for (int j = 0; j < n; j++) {
            if (arr[j] != j) {
                return j;
            }
        }
        return n;
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {3, 0, 1};
        System.out.println("Missing number is: " + missingNumber(arr));

    }
}
