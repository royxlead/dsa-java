package Recursion.Questions.Patterns;

public class UpDownTriangle {

    static void printUpDownTriangle(int row, int col){
        if(row == 0){
            return;
        }
        if(col < row){
            System.out.print("* ");
            printUpDownTriangle(row, col + 1);
        } else{
            System.out.println();
            printUpDownTriangle(row - 1, 0);
            
        }
    }
    public static void main(String[] args) {
        printUpDownTriangle(5, 0);
    }
}
