/*
 * Time Complexity: O(log n)
 * 說明：轉換時間為分鐘 O(n)，使用二分搜尋找下一班時間 O(log n)，主要成本來自 binary search。
 */
import java.util.Scanner;

public class Q2_NextTHSRDeparture {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        sc.nextLine(); // 讀取換行符

        int[] times = new int[n];
        String[] timeStrs = new String[n];
        
        for (int i = 0; i < n; i++) {
            timeStrs[i] = sc.nextLine();
            times[i] = toMinutes(timeStrs[i]);
        }
        
        String queryStr = sc.nextLine();
        int queryTime = toMinutes(queryStr);
        
        int idx = binarySearch(times, queryTime);
        
        if (idx == n) {
            System.out.println("No train");
        } else {
            System.out.println(timeStrs[idx]);
        }
        
        sc.close();
    }
    
    // 將 HH:mm 格式轉換為總分鐘數
    public static int toMinutes(String time) {
        String[] parts = time.split(":");
        int hh = Integer.parseInt(parts[0]);
        int mm = Integer.parseInt(parts[1]);
        return hh * 60 + mm;
    }
    
    // 二分搜尋找第一個大於 query 的索引
    public static int binarySearch(int[] arr, int query) {
        int left = 0;
        int right = arr.length;
        
        while (left < right) {
            int mid = (left + right) / 2;
            if (arr[mid] > query) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        
        return left;
    }
}
