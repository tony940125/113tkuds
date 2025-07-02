import java.util.Scanner;

public class q2seqsearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 讀取陣列長度 n
        int n = sc.nextInt();
        int[] arr = new int[n];

        // 讀取陣列元素
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // 讀取 key
        int key = sc.nextInt();
        int ops = 0;
        boolean found = false;

        // 順序搜尋
        for (int i = 0; i < n; i++) {
            ops++;
            if (arr[i] == key) {
                found = true;
                break;
            }
        }

        // 輸出結果
        if (found) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        System.out.println(ops); // 搜尋過幾次（操作次數）
        sc.close();
    }
}
