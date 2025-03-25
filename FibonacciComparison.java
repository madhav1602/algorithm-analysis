public class FibonacciComparison {

    public static void main(String[] args) {
        int n = 20; // Change N as needed

        // Recursive Approach (O(2ⁿ))
        System.out.println("Recursive Fibonacci: " + recursiveFibonacci(n));

        // Iterative Approach (O(N))
        System.out.println("Iterative Fibonacci: " + iterativeFibonacci(n));
    }

    // Recursive Fibonacci (Exponential Time Complexity O(2ⁿ))
    public static int recursiveFibonacci(int n) {
        if (n <= 1) return n;
        return recursiveFibonacci(n - 1) + recursiveFibonacci(n - 2);
    }

    // Iterative Fibonacci (Linear Time Complexity O(N))
    public static int iterativeFibonacci(int n) {
        if (n <= 1) return n;
        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }
}
