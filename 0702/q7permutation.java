import java.util.Scanner;

public class q7permutation {
    static int ops = 0; // 紀錄排列次數

    // 交換陣列中的兩個元素
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // 使用 backtracking 產生所有排列
    public static void permute(int[] arr, int start) {
        if (start == arr.length) {
            ops++;
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]);
                if (i < arr.length - 1) System.out.print(" ");
            }
            System.out.println();
            return;
        }

        for (int i = start; i < arr.length; i++) {
            swap(arr, start, i);
            permute(arr, start + 1);
            swap(arr, start, i); // backtrack
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 輸入 n

        // 初始化陣列為 1~n
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }

        // 呼叫排列函式
        permute(arr, 0);

        // 輸出排列次數（應為 n!）
        System.out.println(ops);
    }
}
