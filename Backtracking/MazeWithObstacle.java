package Backtracking;

import java.util.ArrayList;

public class MazeWithObstacle {

    static void printMazePathsWithObstacles(int r, int c, String path, boolean[][] maze){
        if(r == maze.length - 1 && c == maze[0].length - 1){
            System.out.println(path);
            return;
        }
        if(r >= maze.length || c >= maze[0].length || maze[r][c]){
            return;
        }
        printMazePathsWithObstacles(r + 1, c, path + "D", maze);
        printMazePathsWithObstacles(r, c + 1, path + "R", maze);
    }

    static ArrayList<String> printMazePathsWithObstaclesList(int r, int c, String path, boolean[][] maze){
        ArrayList<String> paths = new ArrayList<>();
        if(r == maze.length - 1 && c == maze[0].length - 1){
            paths.add(path);
            return paths;
        }
        if(r >= maze.length || c >= maze[0].length || maze[r][c]){
            return paths;
        }
        paths.addAll(printMazePathsWithObstaclesList(r + 1, c, path + "D", maze));
        paths.addAll(printMazePathsWithObstaclesList(r, c + 1, path + "R", maze));
        return paths;
    }
    public static void main(String[] args) {
        boolean[][] maze = {
            {false, false, false},
            {false, true, false},
            {false, false, false}
        };
        // printMazePathsWithObstacles(0, 0, "", maze);
        System.out.println("Paths through the maze: " + printMazePathsWithObstaclesList(0, 0, "", maze));
    }
}
