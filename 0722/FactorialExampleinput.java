import java.util.Scanner;

public class FactorialExampleinput {
    
    // 計算 n 的階乘
    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("請輸入一個非負整數：");
        // 檢查使用者是否輸入了整數
        if (!scanner.hasNextInt()) {
            System.out.println("錯誤：請輸入一個整數。");
        } else {
            int n = scanner.nextInt();
            // 檢查是否為非負
            if (n < 0) {
                System.out.println("錯誤：請輸入非負整數。");
            } else {
                int result = factorial(n);
                System.out.println(n + "! = " + result);
            }
        }
        
        scanner.close();
    }
}