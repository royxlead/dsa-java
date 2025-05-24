package Strings;

public class Main {
    public static void main(String[] args) {
        String str = "Hello, World!";
        System.out.println(str);
        // String methods
        System.out.println("Length: " + str.length());
        System.out.println("Char at 1: " + str.charAt(1));
        System.out.println("Substring (7,12): " + str.substring(7, 12));
        System.out.println("Contains 'World': " + str.contains("World"));
        System.out.println("Index of 'o': " + str.indexOf('o'));
        System.out.println("Last index of 'o': " + str.lastIndexOf('o'));
        System.out.println("Starts with 'Hello': " + str.startsWith("Hello"));
        System.out.println("Ends with '!': " + str.endsWith("!"));
        System.out.println("To upper case: " + str.toUpperCase());
        System.out.println("To lower case: " + str.toLowerCase());
        System.out.println("Replace 'World' with 'Java': " + str.replace("World", "Java"));
        System.out.println("Is empty: " + str.isEmpty());
        System.out.println("Trim: '" + "   padded   ".trim() + "'");
        System.out.println("Split by ',': " + java.util.Arrays.toString(str.split(",")));
        System.out.println("Equals 'Hello, World!': " + str.equals("Hello, World!"));
        System.out.println("Equals ignore case: " + str.equalsIgnoreCase("hello, world!"));
        System.out.println("Compare to 'Hello': " + str.compareTo("Hello"));
        System.out.println("Format: " + String.format("Value: %d", 42));
        System.out.println("Join: " + String.join("-", "A", "B", "C"));
        System.out.println("Repeat: " + "ha".repeat(3));
        System.out.println("To char array: " + java.util.Arrays.toString(str.toCharArray()));
        System.out.println("Value of int: " + String.valueOf(123));

        // StringBuilder methods
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(", ");
        sb.append("World!");
        System.out.println("StringBuilder: " + sb.toString());
        sb.insert(5, " Java");
        System.out.println("Insert: " + sb.toString());
        sb.replace(0, 5, "Hi");
        System.out.println("Replace: " + sb.toString());
        sb.delete(0, 3);
        System.out.println("Delete: " + sb.toString());
        sb.reverse();
        System.out.println("Reverse: " + sb.toString());
        sb.setCharAt(0, '!');
        System.out.println("Set char at 0: " + sb.toString());
        System.out.println("Capacity: " + sb.capacity());
        System.out.println("Length: " + sb.length());
        sb.setLength(5);
        System.out.println("Set length: " + sb.toString());
        sb.ensureCapacity(50);
        System.out.println("Ensure capacity: " + sb.capacity());
        sb.trimToSize();
        System.out.println("Trim to size: " + sb.capacity());
    }
}
