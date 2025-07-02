import java.util.Scanner;

public class q1arraysum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 讀取整數 n
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;

        // 讀取 n 個整數
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // 計算總和
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        // 輸出總和與操作次數
        System.out.println(sum);
        System.out.println(n);  // 操作次數 O(n)
        sc.close();
    }
}
