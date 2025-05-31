package Recursion.InterviewQuestions;

import java.util.ArrayList;
import java.util.List;

public class NumberOfDiceRollsWithTargetSum {

    static int numRollsToTarget(int n, int target){
        if(target < n || target > 6 * n) return 0;
        return numRollsToTargetHelper(n, target);
    }

    static int numRollsToTargetHelper(int n, int target){
        if(n == 0 && target == 0) return 1;
        if(n == 0 || target < 0) return 0; 

        int count = 0;
        for(int i = 1; i <= 6; i++){ 
            count += numRollsToTargetHelper(n - 1, target - i); 
        }
        return count; 
    }

    static List<String> printDiceRolls(int n, int target, String currentRoll) {
        List<String> result = new ArrayList<>();
        if (n == 0 && target == 0) {
            result.add(currentRoll);
            return result;
        }
        if (n == 0 || target < 0) return result;

        for (int i = 1; i <= 6; i++) {
            result.addAll(printDiceRolls(n - 1, target - i, currentRoll + i + " "));
        }
        return result;
    }
    public static void main(String[] args) {
        int n = 2; 
        int target = 4; 
        int result = numRollsToTarget(n, target);
        
        System.out.println("Number of ways to roll " + n + " dice to get a sum of " + target + ": " + result);
        System.out.println("Combinations of dice rolls that sum to " + target + ":");
        List<String> rolls = printDiceRolls(n, target, "");
        for (String roll : rolls) {
            System.out.println(roll.trim());
        }
    }
}
