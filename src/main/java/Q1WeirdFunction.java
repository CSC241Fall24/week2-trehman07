public class Q1WeirdFunction {

    public static int fRecursive(int n) {
        if (n < 3) {
            return n;
        }
        return fRecursive(n - 1) + 2 * fRecursive(n - 2) + 3 * fRecursive(n - 3);
    }

    public static int fIterative(int n) {
        if (n < 3) {
            return n;
        }
        
        int[] f = new int[n + 1];
        f[0] = 0;
        f[1] = 1;
        f[2] = 2;
        
        for (int i = 3; i <= n; i++) {
            f[i] = f[i - 1] + 2 * f[i - 2] + 3 * f[i - 3];
        }
        
        return f[n];
    }
}
