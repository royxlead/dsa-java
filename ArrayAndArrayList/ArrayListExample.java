package ArrayAndArrayList;

import java.util.*; 

public class ArrayListExample {
    public static void main(String[] args) {
        // Syntax
        // ArrayList<datatype> arrayListName = new ArrayList<datatype>(size);
        // OR
        // ArrayList<datatype> arrayListName = new ArrayList<datatype>();
        // OR
        // ArrayList<datatype> arrayListName = new ArrayList<>(); // Java 7+

        // ArrayList of Primitives
        // int[] arr = new int[5]; 
        // OR
        // int[] arr2 = {1, 2, 3, 4, 5}; 
        // OR
        // int[] arr3 = new int[]{1, 2, 3, 4, 5}; 

        // ArrayList of Objects
        // String[] str = new String[5]; 

        // for(int i = 0; i < str.length; i++){
        //     str[i] = sc.nextLine(); 
        // }
        // System.out.println(Arrays.toString(str));

        ArrayList<Integer> list = new ArrayList<>(); // ArrayList of Integer

        list.add(1); // add element to ArrayList
        list.add(2); // add element to ArrayList
        list.add(3); // add element to ArrayList
        list.add(4); // add element to ArrayList

        System.out.println(list); // print ArrayList
        System.out.println(list.contains(2)); // check if ArrayList contains element 2
        System.out.println(list.get(2)); // get element at index 2
        System.out.println(list.size()); // get size of ArrayList
        System.out.println(list.isEmpty()); // check if ArrayList is empty
        System.out.println(list.indexOf(2)); // get index of element 2
        System.out.println(list.lastIndexOf(2)); // get last index of element 2
        System.out.println(list.remove(2)); // remove element at index 2
        System.out.println(list); // print ArrayList
        System.out.println(list.set(2, 5)); // set element at index 2 to 5
        System.out.println(list); // print ArrayList
        System.out.println(list.subList(1, 3)); // get sublist from index 1 to 3
        System.out.println(list); // print ArrayList
        System.out.println(list.toArray()); // convert ArrayList to array
    }
}
