package Recursion.InterviewQuestions;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsOfAPhoneNumber {
    static List<String> letterCombinations(String digits){
        if(digits.isEmpty()){
            return List.of("");
        }
        String[] mappings = {
            "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
        };
        return letterCombinationsHelper(digits, 0, mappings);
    }
    static List<String> letterCombinationsHelper(String digits, int index, String[] mappings){
        if(index == digits.length()){
            return List.of("");
        }
        char digit = digits.charAt(index);
        String letters = mappings[digit - '0'];

        List<String> combinations = letterCombinationsHelper(digits, index + 1, mappings);
        List<String> res = new ArrayList<>();
        
        for(char letter : letters.toCharArray()){
            for(String combination : combinations){
                res.add(letter + combination);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        String digits = "23";
        List<String> combinations = letterCombinations(digits);
        System.out.println(combinations);
    }
}
