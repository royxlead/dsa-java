package Backtracking;

import java.util.ArrayList;

public class PrintAllPath {

    static void printAllPathsUDRL(int r, int c, String path, boolean[][] visited){
        if(r < 0 || c < 0 || r >= visited.length || c >= visited[0].length || visited[r][c]){
            return;
        }
        if(r == visited.length - 1 && c == visited[0].length - 1){
            System.out.println(path);
            return;
        }
        visited[r][c] = true; 
        printAllPathsUDRL(r + 1, c, path + "D", visited);
        printAllPathsUDRL(r - 1, c, path + "U", visited);
        printAllPathsUDRL(r, c + 1, path + "R", visited);
        printAllPathsUDRL(r, c - 1, path + "L", visited);
        visited[r][c] = false;
    }

    static ArrayList<String> getAllPathsUDRL(int r, int c, String path, boolean[][] visited){
        ArrayList<String> paths = new ArrayList<>();
        if(r < 0 || c < 0 || r >= visited.length || c >= visited[0].length || visited[r][c]){
            return paths;
        }
        if(r == visited.length - 1 && c == visited[0].length - 1){
            paths.add(path);
            return paths;
        }
        visited[r][c] = true; 
        paths.addAll(getAllPathsUDRL(r + 1, c, path + "D", visited));
        paths.addAll(getAllPathsUDRL(r - 1, c, path + "U", visited));
        paths.addAll(getAllPathsUDRL(r, c + 1, path + "R", visited));
        paths.addAll(getAllPathsUDRL(r, c - 1, path + "L", visited));
        visited[r][c] = false;
        return paths;
    }

    static boolean isVisited(int r, int c, boolean[][] visited){
        return r < 0 || c < 0 || r >= visited.length || c >= visited[0].length || visited[r][c];
    }
    public static void main(String[] args) {
        boolean[][] visited = new boolean[3][3];
        // printAllPathsUDRL(0, 0, "", visited);
        System.out.println("All paths from (0,0) to (2,2): " + getAllPathsUDRL(0, 0, "", visited));
    }
}
