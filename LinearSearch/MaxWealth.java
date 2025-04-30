package LinearSearch;

public class MaxWealth {
    public static void main(String[] args) {
        int[][] accounts = {
            {1, 2, 3},
            {3, 2, 1},
            {4, 5, 6}
        };
        System.out.println(maxWealth(accounts));
    }
    // find the maximum wealth in the 2D array
    static int maxWealth(int[][] accounts){
        if(accounts.length == 0) return 0;
        int max = 0;
        for(int row=0; row<accounts.length; row++){
            int sum = 0;
            for(int col=0; col<accounts[row].length; col++){
                sum += accounts[row][col];
            }
            if(sum > max) max = sum;
            // max = Math.max(max, sum); // using Math.max to find the maximum wealth
        }
        return max;
    }
}
