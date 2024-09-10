public class Q1WeirdFunction {

    public static int fRecursive(int n) {
        // Base case: if n < 3, return n
        if (n < 3) {
            return n;
        }
        
        // Recursive case: f(n) = f(n-1) + 2f(n-2) + 3f(n-3)
        return fRecursive(n - 1) + 2 * fRecursive(n - 2) + 3 * fRecursive(n - 3);
    }

    public static int fIterative(int n) {
        // If n < 3, return n
        if (n < 3) {
            return n;
        }
        
        // Initialize an array to store the first n+1 values
        int[] f = new int[n + 1];
        
        // Set the base cases
        f[0] = 0;
        f[1] = 1;
        f[2] = 2;
        
        // Iteratively calculate the rest of the values
        for (int i = 3; i <= n; i++) {
            f[i] = f[i - 1] + 2 * f[i - 2] + 3 * f[i - 3];
        }
        
        // Return the nth value
        return f[n];
    }

    // Optional: main method for testing
    public static void main(String[] args) {
        int n = 10; // Example value
        System.out.println("Recursive result for n=" + n + ": " + fRecursive(n));
        System.out.println("Iterative result for n=" + n + ": " + fIterative(n));
    }
}
