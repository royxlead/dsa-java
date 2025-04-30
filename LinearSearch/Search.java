package LinearSearch;

public class Search {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int ls = linearSearch(arr, 2);
        int ls2 = linearSearch2(arr, 2);
        System.out.println(ls);
        System.out.println(ls2);
    }
    // search in the array: return the index if item is found, otherwise return -1
    static int linearSearch(int[] arr, int target){
        if(arr.length == 0) return -1;

        for(int i=0; i<arr.length; i++){
            if(arr[i] == target) return i;
        }
        return -1;
    }
    static int linearSearch2(int[] arr, int target){
        if(arr.length == 0) return -1;

        for(int num : arr){
            if(num == target) return num;
        }
        return -1;
    }
}