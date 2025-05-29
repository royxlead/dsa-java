package Recursion.Questions.Arrays;

public class SortedArrays {
    static boolean isSorted(int[] arr, int index){
        if(index >= arr.length - 1) {
            return true;
        }
        if(arr[index] > arr[index + 1]){
            return false;
        }
        return isSorted(arr, index + 1);
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        if(isSorted(arr, 0)){
            System.out.println("Array is sorted");
        } else {
            System.out.println("Array is not sorted");
        }
    }
}
