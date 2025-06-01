package Backtracking;

import java.util.ArrayList;

public class CountingPaths {

    static int countPaths(int r, int c){
        if(r == 1 || c == 1){
            return 1;
        }
        return countPaths(r - 1, c) + countPaths(r, c - 1);
    }

    static void printPaths(int r, int c, String path){
        if(r ==1 && c == 1){
            System.out.println(path);
            return;
        }
        if(r > 1){
            printPaths(r - 1, c, path + "D");
        }
        if(c > 1){
            printPaths(r, c - 1, path + "R");
        }
    }
    static ArrayList<String> getPaths(int r, int c, String path){
        ArrayList<String> res = new ArrayList<>();
        if(r == 1 && c == 1){
            res.add(path);
            return res;
        }
         if(r > 1){
           res.addAll(getPaths(r - 1, c, path + "D"));
        }
        if(c > 1){
            res.addAll(getPaths(r, c - 1, path + "R"));
        }
        return res;
    }
    
    static ArrayList<String> getDiagonalPath(int r, int c, String path){
        ArrayList<String> res = new ArrayList<>();
        if(r == 1 && c == 1){
            res.add(path);
            return res;
        }
        if(r > 1 && c > 1){
            res.addAll(getDiagonalPath(r - 1, c - 1, path + "d"));
        }
        if(r > 1){
            res.addAll(getDiagonalPath(r - 1, c, path + "D"));
        }
        if(c > 1){
            res.addAll(getDiagonalPath(r, c - 1, path + "R"));
        }
        return res;
    }
    public static void main(String[] args) {
        int rows = 3;
        int cols = 3;
        int totalPaths = countPaths(rows, cols);
        System.out.println("Total paths from (1,1) to (" + rows + "," + cols + "): " + totalPaths);
        System.out.print("All paths: ");
        // printPaths(rows, cols, "");
        System.out.println(getPaths(rows, cols, ""));
        System.out.println("Including diagonal paths: " + getDiagonalPath(rows, cols, ""));
    }
}
