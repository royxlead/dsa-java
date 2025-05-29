package Recursion.Questions.Arrays;

import java.util.ArrayList;

public class LinearSearch {

    static ArrayList<Integer> linearSearch(int[] arr, int target, int index, ArrayList<Integer> result) {
        if (index >= arr.length) {
            return result;
        }
        if (arr[index] == target) {
            result.add(index);
        }
        return linearSearch(arr, target, index + 1, result);
    }

    static int linearSearch(int[] arr, int target, int index){
        if(index >= arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        return linearSearch(arr, target, index + 1);
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int target = 3;
        ArrayList<Integer> indices = linearSearch(arr, target, 0, new ArrayList<>());
        if (!indices.isEmpty()) {
            System.out.println("Element found at indices: " + indices);
        } else {
            System.out.println("Element not found");
        }
    }
}
