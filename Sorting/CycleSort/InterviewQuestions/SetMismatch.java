package Sorting.CycleSort.InterviewQuestions;

public class SetMismatch {

    static int[] findErrorNums(int[] arr){
        int n = arr.length;
        int i = 0;

        while(i < n){
            int correctPos = arr[i] - 1;

            if(arr[i] != arr[correctPos]){
                swap(arr, i, correctPos);
            } else{
                i++;
            }
        }
        int[] result = new int[2];

        for(int j = 0; j < n; j++){
            if(arr[j] != j + 1){
                result[0] = arr[j];
                result[1] = j + 1;
                break;
            }
        }
        return result;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 4};
        int[] result = findErrorNums(arr);
        System.out.println("Duplicate: " + result[0] + ", Missing: " + result[1]);
    }
}
