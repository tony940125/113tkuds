import java.util.Scanner;

public class q3binsearch {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 讀取陣列大小
        int n = sc.nextInt();
        int[] arr = new int[n];

        // 讀取已排序的陣列
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // 讀取欲查找的 key
        int key = sc.nextInt();

        int left = 0;
        int right = n - 1;
        int ops = 0;
        int index = -1;

        // 二元搜尋迴圈
        while (left <= right) {
            ops++;
            int mid = (left + right) / 2;
            if (arr[mid] == key) {
                index = mid;
                break;
            } else if (arr[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        // 輸出結果
        System.out.println(index);
        System.out.println(ops);  // 操作次數
    }
}
