package Sorting.CycleSort;

public class sort {

    static void cycleSort(int[] arr){
        int i = 0;

        while (i < arr.length) {
            int correctPos = arr[i] - 1;

            if(arr[i] != arr[correctPos]){
                swap(arr, i, correctPos);
            } else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static void printArray(int[] arr){
        for(int num : arr){
            System.out.print(num + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = { 3, 1, 5, 2, 4 };
        System.out.println("Before sorting: ");
        printArray(arr);
        cycleSort(arr);
        System.out.println("After sorting: ");
        printArray(arr);
    }
}
