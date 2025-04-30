package LinearSearch;

public class StringSearch {
    public static void main(String[] args) {
        String name = "Sourav";
        char target = 'S';
        System.out.println(linearSearch(name, target));
    }
    // search in the string: return true if item is found, otherwise return false
    static boolean linearSearch(String str, char target){
        if(str.length() == 0) return false;

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == target) return true;
        }
        return false;
    }
}
