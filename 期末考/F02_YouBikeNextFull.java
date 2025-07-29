import java.util.*;

public class F02_YouBikeNextFull {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        int[] times = new int[n];

        // 將時間轉換為分鐘儲存
        for (int i = 0; i < n; i++) {
            String[] parts = sc.nextLine().split(":");
            int hour = Integer.parseInt(parts[0]);
            int min = Integer.parseInt(parts[1]);
            times[i] = hour * 60 + min;
        }

        // 查詢時間
        String[] queryParts = sc.nextLine().split(":");
        int query = Integer.parseInt(queryParts[0]) * 60 + Integer.parseInt(queryParts[1]);

        // 二分搜尋找到第一個大於查詢時間的時間點
        int left = 0, right = n - 1, ans = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (times[mid] > query) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        if (ans == -1) {
            System.out.println("No bike");
        } else {
            int h = times[ans] / 60;
            int m = times[ans] % 60;
            System.out.printf("%02d:%02d\n", h, m);
        }
    }
}

/*
 * Time Complexity: O(log n)
 * 說明：使用二分搜尋法，在排序好的 n 筆時間中找出第一個大於查詢值的時間。
 */
