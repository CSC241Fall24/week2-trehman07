public class Q4ReverseString {
    public static String reverse(String s) {
        // if string is empty or has only one character, return it
        if (s.length() <= 1) {
            return s;
        }
        
        // taking the first character and move it to the end
        return reverse(s.substring(1)) + s.charAt(0);
    }

    // Optional: main method for testing
    public static void main(String[] args) {
        String test = "test string";
        System.out.println("Original: " + test);
        System.out.println("Reversed: " + reverse(test));
    }
}
