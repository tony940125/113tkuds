import java.util.Scanner;

public class Q1_THSRStopCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt(); // 讀取停靠站數
        String[] stops = new String[n];
        for (int i = 0; i < n; i++) {
            stops[i] = sc.next(); // 讀取各停靠站代碼
        }

        String start = sc.next(); // 起點站
        String end = sc.next();   // 終點站

        int startIdx = -1;
        int endIdx = -1;

        // 尋找起點與終點索引
        for (int i = 0; i < n; i++) {
            if (stops[i].equals(start)) {
                startIdx = i;
            }
            if (stops[i].equals(end)) {
                endIdx = i;
            }
        }

        // 檢查是否找到站點
        if (startIdx == -1 || endIdx == -1) {
            System.out.println("Invalid");
        } else {
            int count = Math.abs(startIdx - endIdx) + 1;
            System.out.println(count);
        }

        sc.close();
    }
}
