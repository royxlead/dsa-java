package Recursion.String;

import java.util.ArrayList;

public class Sequence {
    
    static void subsequence(String p, String up){
        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subsequence(p + ch, up.substring(1));
        subsequence(p, up.substring(1));
    }

    static ArrayList<String> subsequenceList(String p, String up) {
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subsequenceList(p + ch, up.substring(1));
        ArrayList<String> right = subsequenceList(p, up.substring(1));
        left.addAll(right);
        return left;
    }

    public static void main(String[] args) {
        String str = "abc";
        subsequence("", str);

        ArrayList<String> result = subsequenceList("", str);
        System.out.println(result);
    }
}
