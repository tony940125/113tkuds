public class DigitSumExample {
    public static int digitSum(int n) {
        // 終止條件：當 n < 10 時，直接回傳 n（只有一位數）
        if (n < 10) {
            return n;
        }
        // 遞迴步驟：取最後一位數字，加上剩下部分的 digitSum
        return (n % 10) + digitSum(n / 10);
    }

    public static void main(String[] args) {
        System.out.println("digitSum(1234) = " + digitSum(1234));  // 10
        System.out.println("digitSum(9876) = " + digitSum(9876));  // 30
    }
}
