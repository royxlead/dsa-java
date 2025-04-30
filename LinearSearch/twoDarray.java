package LinearSearch;

import java.util.Arrays;

public class twoDarray {
    public static void main(String[] args) {
        int[][] arr = {
            {123, 2, 45},
            {4,15, 6, 5},
            {7, 18, 97},
            {8,101}
        };
        int target = 101;
        int[] result = linearSearch(arr, target);
        System.out.println(Arrays.toString(result));
    }
    // search in the 2D array: return true if item is found, otherwise return false
    static int[] linearSearch(int[][] arr, int target){
        if(arr.length ==0) return new int[]{-1, -1};

        for(int row=0; row<arr.length; row++){
            for(int col=0; col<arr[row].length; col++){
                if(arr[row][col] == target) return new int[]{row, col};
            }
        }
        return new int[]{-1, -1};
    }
}
