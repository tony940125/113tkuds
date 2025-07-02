import java.util.Scanner;

public class q4paircount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 讀取 n
        int n = sc.nextInt();
        int[] arr = new int[n];

        // 讀取陣列
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int pairCount = 0;
        int ops = 0;

        // 雙層迴圈計算不同索引配對數
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                pairCount++;
                ops++;
                // 如果有進一步配對條件，可在此加入判斷邏輯
            }
        }

        // 輸出配對數與操作次數
        System.out.println(pairCount);
        System.out.println(ops);
    }

    @Override
    public String toString() {
        return "q4paircount []";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return super.equals(obj);
    }

    @Override
    protected void finalize() throws Throwable {
        // TODO Auto-generated method stub
        super.finalize();
    }

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return super.hashCode();
    }
}
