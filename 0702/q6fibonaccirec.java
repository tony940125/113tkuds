import java.util.Scanner;

public class q6fibonaccirec {
    static int ops = 0; // 遞迴呼叫次數

    // 遞迴函式：計算第 n 項 Fibonacci
    public static int fib(int n) {
        ops++;
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();           // 讀取 n
        int result = fib(n);           // 計算 F(n)

        System.out.println(result);    // 輸出 Fibonacci 值
        System.out.println(ops);       // 輸出遞迴呼叫次數
    }
}
