package Sorting.SelectionSort;

public class sort {

    static void sort(int[] arr){
        int n = arr.length;

        for(int i = 0; i < n - 1; i++){
            int pivot = i;

            for(int j = i +  1; j < n; j++){
                if(arr[j] < arr[pivot]){
                    pivot = j;
                }
            }
            if(pivot != i){
                int temp = arr[i];
                arr[i] = arr[pivot];
                arr[pivot] = temp;
            }
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
