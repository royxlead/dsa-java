package Sorting.CycleSort.InterviewQuestions;

public class FirstMissingPositive {

    static int firstMissingPositive(int[] arr){
        int n = arr.length;
        int i = 0;

        while (i < n) {
            int correctPos = arr[i] - 1;
            if(arr[i] > 0 && arr[i] <= n && arr[i] != arr[correctPos]){
                swap(arr, i, correctPos);
            } else{
                i++;
            }
        }
        for(int j = 0; j < n; j++){
            if(arr[j] != j + 1){
                return j + 1;
            }
        }
        return n + 1;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {3, 4, -1, 1};
        System.out.println("First missing positive is: " + firstMissingPositive(arr));
    }
}
