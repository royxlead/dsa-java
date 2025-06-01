package Backtracking;

public class NQueens {

    static void placeNQueens(boolean[][] board, int row, int n){
        if(row == n){
            printBoard(board);
            System.out.println("-----------------");
            return;
        }
        for(int col = 0; col < n; col++){
            if(isVisited(board, row, col, n)){
                board[row][col] = true;
                placeNQueens(board, row + 1, n);
                board[row][col] = false;
            }
        }
    }
    static boolean printBoard(boolean[][] board){
        for(boolean[] row : board){
            for(boolean cell : row){
                System.out.print(cell ? "Q" : ".");
                System.out.print(" ");
            }
            System.out.println();
        }
        return true;
    }
    
    static boolean isVisited(boolean[][] board, int row, int col, int n){
        for(int i = 0; i < row; i++){
            if(board[i][col]){
                return false;
            }
            if(col - (row - i) >= 0 && board[i][col -(row - i)]){
                return false;
            }
            if(col + (row - i) < n && board[i][col + (row - i)]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        placeNQueens(board, 0, n);
    }
}
