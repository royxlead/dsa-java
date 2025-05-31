package Recursion.String;

public class ASCIIValue {

    static void printASCIIValues(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        printASCIIValues(p + ch, up.substring(1));
        printASCIIValues(p, up.substring(1));
        printASCIIValues(p + (ch + 0), up.substring(1));

    }
    public static void main(String[] args) {
        String str = "abc";
        printASCIIValues("", str);
    }
}
