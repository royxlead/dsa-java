package TicTacToe;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char[][] board = new char[3][3];

        for(int row = 0; row < board.length; row++) {
            for(int col = 0; col < board[row].length; col++) {
                board[row][col] = ' ';
            }
        }
        char currentPlayer = 'X';
        boolean gameWon = false;

        Scanner scanner = new Scanner(System.in);

        while (!gameWon) {
            printBoard(board);
            System.out.println("Player " + currentPlayer + ", enter your move (row and column): ");
            int row = scanner.nextInt();
            int col = scanner.nextInt();


            if(board[row][col] == ' ') {
                board[row][col] = currentPlayer;
                gameWon = checkWin(board, currentPlayer);
                if(gameWon) {
                    System.out.println("Player " + currentPlayer + " wins!");
                } else{
                    currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
                }
            } else {
                System.out.println("This cell is already occupied. Try again.");

            }
        }
        printBoard(board);
        System.out.println("Game over!");
        scanner.close();
    }

    static boolean checkWin(char[][] board, char currentPlayer){
        for(int row = 0; row < 3; row++){
            if(board[row][0] == currentPlayer && board[row][1] == currentPlayer && board[row][2] == currentPlayer) {
                return true; 
            }
        }
        for(int col = 0; col < 3; col++){
            if(board[0][col] == currentPlayer && board[1][col] == currentPlayer && board[2][col] == currentPlayer) {
                return true; 
            }
        }
        if(board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) {
            return true; 
        }
        if(board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer) {
            return true; 
        }
        return false;
    }

    static void printBoard(char[][] board){
        System.out.println("Current board:");
        for(int row = 0; row < board.length; row++) {
            for(int col = 0; col < board[row].length; col++) {
                System.out.print(board[row][col]);
                if(col < board[row].length - 1) {
                    System.out.print("|");
                }
            }
            System.out.println();
            if(row < board.length - 1) {
                System.out.println("-----");
            }
        }
    }
}
