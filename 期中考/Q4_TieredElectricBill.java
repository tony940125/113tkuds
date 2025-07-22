/*
 * Time Complexity: O(n)
 * 說明：n 筆資料，對每筆用電量 calc() 處理 O(1) 時間，總共 O(n)。
 */
import java.util.Scanner;

public class Q4_TieredElectricBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] kWhs = new int[n];
        for (int i = 0; i < n; i++) {
            kWhs[i] = sc.nextInt();
        }

        int total = 0;
        for (int i = 0; i < n; i++) {
            int bill = calc(kWhs[i]);
            total += bill;
            System.out.println("Bill: $" + bill);
        }

        int avg = Math.round((float) total / n);
        System.out.println("Total: $" + total);
        System.out.println("Average: $" + avg);

        sc.close();
    }

    public static int calc(int k) {
        double sum = 0;
        if (k > 1000) { sum += (k - 1000) * 8.46; k = 1000; }
        if (k > 700) { sum += (k - 700) * 6.24; k = 700; }
        if (k > 500) { sum += (k - 500) * 5.04; k = 500; }
        if (k > 330) { sum += (k - 330) * 3.70; k = 330; }
        if (k > 120) { sum += (k - 120) * 2.45; k = 120; }
        sum += k * 1.68;
        return (int) Math.round(sum);
    }
}
