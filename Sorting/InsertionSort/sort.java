package Sorting.InsertionSort;

public class sort {
    
    static void sort(int[] arr){
        int n = arr.length;

        for(int i = 1; i < n; i++){
            
            int pivot = arr[i];
            int j = i - 1;

            while(j >= 0 && arr[j] > pivot){
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = pivot;
        }
    }
    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 4, 2};
        sort(arr);

        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}
