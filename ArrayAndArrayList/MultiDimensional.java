package ArrayAndArrayList;

import java.util.ArrayList; // Importing ArrayList class from java.util package

public class MultiDimensional {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>(); // ArrayList of ArrayList of Integer

        for (int i = 0; i < 3; i++) { // Loop to create 3 ArrayLists
            list.add(new ArrayList<>()); // Add new ArrayList to main ArrayList
        }
        for (int i = 0; i < 3; i++) { // Loop to add elements to each ArrayList
            for (int j = 0; j < 3; j++) { // Loop to add elements to each ArrayList
                list.get(i).add(j); // Add element to ArrayList at index i
            }
        }
        for (int i = 0; i < list.size(); i++) { // Loop to print each ArrayList
            System.out.println(list.get(i)); // Print ArrayList at index i
        }
        System.out.println(list); // Print main ArrayList
        
    }    
}
