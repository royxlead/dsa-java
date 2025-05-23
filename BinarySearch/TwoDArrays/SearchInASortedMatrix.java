package BinarySearch.TwoDArrays;

public class SearchInASortedMatrix{

    static int[] binarySearch(int[][] matrix, int row, int colStart, int colEnd, int target){
        while (colStart <= colEnd) {
            int mid = colStart + (colEnd - colStart) / 2;

            if(matrix[row][mid] == target){
                return new int[]{row, mid};
            } else if(matrix[row][mid] < target){
                colStart = mid + 1;
            } else{
                colEnd = mid - 1;
            }
        }
        return new int[]{-1, -1};
    }

    static int[] search(int[][] matrix, int target){
    int row = matrix.length;
    int col = matrix[0].length;

    if(row == 1){
        return binarySearch(matrix, 0, 0, col - 1, target);
    }

    int rowStart = 0;
    int rowEnd = row - 1;
    int colMid = col / 2;

    while (rowStart < rowEnd - 1) {
        int mid = rowStart + (rowEnd - rowStart) / 2;

        if(matrix[mid][colMid] == target){
            return new int[]{mid, colMid};
        } else if(matrix[mid][colMid] < target){
            rowStart = mid;
        } else{
            rowEnd = mid;
        }
    }

    if(matrix[rowStart][colMid] == target){
        return new int[]{rowStart, colMid};
    }
    if(matrix[rowEnd][colMid] == target){
        return new int[]{rowEnd, colMid};
    }

    if (target <= matrix[rowStart][colMid - 1]) {
        return binarySearch(matrix, rowStart, 0, colMid - 1, target);
    }

    if (target >= matrix[rowStart][colMid + 1] && target <= matrix[rowStart][col - 1]) {
        return binarySearch(matrix, rowStart, colMid + 1, col - 1, target);
    }

    if (target <= matrix[rowEnd][colMid - 1]) {
        return binarySearch(matrix, rowEnd, 0, colMid - 1, target);
    }

    else {
        return binarySearch(matrix, rowEnd, colMid + 1, col - 1, target);
    }
}

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 10},
            {11, 12, 13, 14, 15},
            {16, 17, 18, 19, 20},
            {21, 22, 23, 24, 25}
        };
        int target = 7;
        int[] result = search(matrix, target);
        if(result[0] != -1){
            System.out.println("Element found at: (" + result[0] + ", " + result[1] + ")");
        } else{
            System.out.println("Element not found");
        }
    }
}