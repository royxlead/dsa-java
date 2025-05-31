package Recursion.String;

public class Basics {

    static String skip(String str, int index) {
        if (index == str.length()) {
            return "";
        }
        if (str.charAt(index) == 'a') {
            return skip(str, index + 1);
        } else {
            return str.charAt(index) + skip(str, index + 1);
        }
    }

    static String skipApple(String str, int index){
        if(index == str.length()){
            return "";
        }
        if(str.substring(index).startsWith("apple")){
            return skipApple(str, index + 5);
        }else{
            return str.charAt(index) + skipApple(str, index + 1);
        }
    }
    public static void main(String[] args) {
        String str = "baccad";
        String result = skip(str, 0);
        System.out.println(result);

        String str2 = "bapplecappled";
        String result2 = skipApple(str2, 0);
        System.out.println(result2);
    }
}
