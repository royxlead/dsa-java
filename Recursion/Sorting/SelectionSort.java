package Recursion.Sorting;

public class SelectionSort {
    
    static void selectionSort(int[] arr, int n, int index) {
        if (index == n - 1) {
            return;
        }

        int minIndex = index;
        for (int j = index + 1; j < n; j++) {
            if (arr[j] < arr[minIndex]) {
                minIndex = j;
            }
        }

        int temp = arr[index];
        arr[index] = arr[minIndex];
        arr[minIndex] = temp;

        selectionSort(arr, n, index + 1);
    }
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        int n = arr.length;

        selectionSort(arr, n, 0);

        System.out.println("Sorted array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
