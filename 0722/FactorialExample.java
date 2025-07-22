public class FactorialExample    {
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println("3! = " + factorial(3));  // 輸出: 6
        System.out.println("5! = " + factorial(5));  // 輸出: 120
        System.out.println("0! = " + factorial(0));  // 輸出: 1
    }
}
