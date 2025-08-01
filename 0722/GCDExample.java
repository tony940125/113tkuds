public class GCDExample {
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        System.out.println("GCD(48, 18) = " + gcd(48, 18)); // 6
        System.out.println("GCD(56, 98) = " + gcd(56, 98)); // 14
    }
}
