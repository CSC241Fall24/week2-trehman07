public class Q3PrintArrayBackwards {
    private static int[] array = {1, 2, 3, 4, 5, 6, 7};

    public static void main(String[] args) {
        printRecursion(array.length);
    }

    private static void printRecursion(int i) {
        // we've printed all elements
        if (i == 0) {
            return;
        }
        
        // Print the current element (at index i-1)
        System.out.println(array[i - 1]);
        
        // Recursive call with i-1
        printRecursion(i - 1);
    }
}
