public class FibonacciExample {
    public static int fibonacci(int n) {
        // 終止條件
        if (n == 0) return 0;
        if (n == 1) return 1;
        // 遞迴公式
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        System.out.println("fibonacci(0) = " + fibonacci(0));  // 0
        System.out.println("fibonacci(1) = " + fibonacci(1));  // 1
        System.out.println("fibonacci(5) = " + fibonacci(5));  // 5
        System.out.println("fibonacci(10) = " + fibonacci(10)); // 55
    }
}
