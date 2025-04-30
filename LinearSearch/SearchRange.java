package LinearSearch;

public class SearchRange {
    public static void main(String[] args) {
        
        int[] arr = {1, 2, 3, 4, 5};
        int target = 3;
        int start = 0;
        int end = arr.length - 1;
        int result = search(arr, target, start, end);
        System.out.println("Target found at index: " + result);
    }
    static int search(int[] arr, int target, int start, int end){
        if(arr.length == 0) return -1;
        if(start > end) return -1;

        for(int i=start; i<=end; i++){
            if(arr[i] == target) return i;
        }
        return -1;
    }
}
