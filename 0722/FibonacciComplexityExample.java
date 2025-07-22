public class FibonacciComplexityExample {

    // 標準遞迴版本 - 效率很差
    public static int fibonacciSlow(int n) {
        if (n <= 1) return n;
        return fibonacciSlow(n - 1) + fibonacciSlow(n - 2);
    }
    // 時間複雜度：O(2^n) - 指數級成長！
    // 空間複雜度：O(n) - 遞迴深度最多為 n

    // 記憶化版本 - 效率很好
    public static int fibonacciFast(int n, int[] memo) {
        if (n <= 1) return n;
        if (memo[n] != 0) return memo[n];
        memo[n] = fibonacciFast(n - 1, memo) + fibonacciFast(n - 2, memo);
        return memo[n];
    }
    // 時間複雜度：O(n) - 每個數字只計算一次
    // 空間複雜度：O(n) - 儲存計算結果

    public static void main(String[] args) {
        int n = 30;  // 可以調整 n 觀察差異

        System.out.println("fibonacciSlow(" + n + ") = " + fibonacciSlow(n));

        int[] memo = new int[n + 1];
        System.out.println("fibonacciFast(" + n + ") = " + fibonacciFast(n, memo));
    }
}
