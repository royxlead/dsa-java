package Sorting.CycleSort.InterviewQuestions;

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedInAnArray {

    static List<Integer> findDisappearedNumbers(int[] arr){
        int n = arr.length;
        int i = 0;

        while (i < n) {
            int correctPos = arr[i] - 1;

            if (arr[i] <= n && arr[i] != arr[correctPos]) {
                swap(arr, i, correctPos);
            } else {
                i++;
            }
        }
        List<Integer> ans = new ArrayList<>();

        for (int j = 0; j < n; j++) {
            if (arr[j] != j + 1) {
                ans.add(j + 1);
            }
        }
        return ans;
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println("Numbers that disappeared in the array: " + findDisappearedNumbers(arr));
    }
}
