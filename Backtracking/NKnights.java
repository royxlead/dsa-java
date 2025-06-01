package Backtracking;

public class NKnights {

    static void placeNKnights(boolean[][] board, int row, int n, int knightsPlaced) {
        if (knightsPlaced == n) {
            printBoard(board);
            System.out.println("-----------------");
            return;
        }
        if (row >= n) {
            return;
        }
        for (int col = 0; col < n; col++) {
            if (isVisited(board, row, col, n)) {
                board[row][col] = true; 
                placeNKnights(board, row + 1, n, knightsPlaced + 1);
                board[row][col] = false;
            }
        }
        placeNKnights(board, row + 1, n, knightsPlaced); 
    }
    static boolean isVisited(boolean[][] board, int row, int col, int n) {
        int[] rowMoves = {-2, -1, 1, 2, 2, 1, -1, -2};
        int[] colMoves = {1, 2, 2, 1, -1, -2, -2, -1};

        for (int i = 0; i < rowMoves.length; i++) {
            int newRow = row + rowMoves[i];
            int newCol = col + colMoves[i];
            if (newRow >= 0 && newRow < n && newCol >= 0 && newCol < n && board[newRow][newCol]) {
                return false; 
            }
        }
        return true; 
    }
    static void printBoard(boolean[][] board) {
        for (boolean[] row : board) {
            for (boolean cell : row) {
                System.out.print(cell ? "K" : ".");
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        int n = 4; 
        boolean[][] board = new boolean[n][n];
        placeNKnights(board, 0, n, 0);
    }
}