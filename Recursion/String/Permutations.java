package Recursion.String;

import java.util.ArrayList;

public class Permutations {

    static void permutations(String p, String up) {
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        for(int i = 0; i <= p.length(); i++){
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            permutations(f + ch + s, up.substring(1));
        }
    }

    static ArrayList<String> permutationsList(String p, String up) {
    
        ArrayList<String> res = new ArrayList<>();
        if(up.isEmpty()){
            res.add(p);
            return res;
        }
        char ch = up.charAt(0);

        for(int i = 0; i <= p.length(); i++){
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            res.addAll(permutationsList(f + ch + s, up.substring(1)));
        }
        return res;
    }
    public static void main(String[] args) {
        String str = "abc";
        // permutations("", str);
        ArrayList<String> result = permutationsList("", str);
        System.out.println(result);
    }
}
