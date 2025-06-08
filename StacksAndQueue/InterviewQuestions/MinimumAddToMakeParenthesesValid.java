package StacksAndQueue.InterviewQuestions;

import java.util.Stack;

public class MinimumAddToMakeParenthesesValid {

    static int minAddToMakeValid(String s){
        Stack<Character> stack = new Stack<>();
        int count  = 0;

        for(char c : s.toCharArray()){
            if(c == '(' || c == '{' || c == '['){
                stack.push(c);
            }
            else{
                if(stack.isEmpty()){
                    count++;
                } else{
                    char top = stack.peek();

                    if(top == '(' && c == ')'){
                        stack.pop();
                    } else if(top == '{' && c == '}'){
                        stack.pop();
                    } else if(top == '[' && c == ']'){
                        stack.pop();
                    } else{
                        count++;
                    }
                }
            }
        }
        return count + stack.size();
    }
    public static void main(String[] args) {
        String s = "())";
        System.out.println(minAddToMakeValid(s));
    }
}