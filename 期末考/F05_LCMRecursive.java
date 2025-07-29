import java.util.*;

public class F05_LCMRecursive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int gcd = recursiveGCD(a, b);
        int lcm = a * b / gcd;

        System.out.println("LCM: " + lcm);
    }

    // 輾轉相減法（遞迴版）
    public static int recursiveGCD(int a, int b) {
        if (a == b) return a;
        if (a > b) return recursiveGCD(a - b, b);
        else return recursiveGCD(a, b - a);
    }
}

/*
 * Time Complexity: O(max(a, b))
 * 說明：輾轉相減法每次遞迴最多減去 1，最壞情況會執行 max(a, b) 次遞迴。
 * 相較於歐幾里得除法（O(log n)），相減法效率較差。
 */
