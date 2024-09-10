public class Q2PrintArray {
    private static int[] array = {1, 2, 3, 4, 5, 6, 7};

        public static void main(String[] args) {
            printRecursion(array.length);
        }

        public static void printRecursion(int i) {
            if (i >= 1) {
                printRecursion(i - 1);
                System.out.print(array[i - 1] + ",");
            }
        }
}
