import java.util.*;

public class F04_TieredIncomeTax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] incomes = new int[n];
        int[] taxes = new int[n];
        int totalTax = 0;

        for (int i = 0; i < n; i++) {
            incomes[i] = sc.nextInt();
            taxes[i] = calculateTax(incomes[i]);
            totalTax += taxes[i];
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Tax: $" + taxes[i]);
        }

        int avgTax = totalTax / n;
        System.out.println("Average: $" + avgTax);
    }

    // 2025 綜所稅級距
    public static int calculateTax(int income) {
        int tax = 0;
        int[] brackets = {0, 560000, 1260000, 2520000, 4720000};
        int[] rates = {5, 12, 20, 30, 40};
        int[] limits = {560000, 700000, 1260000, 2200000, Integer.MAX_VALUE};

        for (int i = 0; i < 5; i++) {
            if (income <= brackets[i]) {
                break;
            }
            int taxable = Math.min(income, brackets[i] + limits[i]) - brackets[i];
            tax += taxable * rates[i] / 100;
        }

        return tax;
    }
}

/*
 * Time Complexity: O(n)
 * 說明：每筆收入皆一次計算稅額，共 n 筆，且每筆最多走訪 5 段稅率區間，為常數時間操作。
 */
