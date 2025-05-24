package Sorting.CycleSort.InterviewQuestions;

public class FindTheDuplicateNumber {

    static int findDuplicate(int[] arr){
        int n = arr.length;
        int i = 0;

        while (i < n) {
            int correctPos = arr[i] - 1;

            if (arr[i] != arr[correctPos]) {
                swap(arr, i, correctPos);
            } else{
                if(arr[i] != i + 1){
                    return arr[i];
                }
                i++;
            }
        }
        return -1;  
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 2};
        System.out.println("Duplicate number is: " + findDuplicate(arr));
    }
}
