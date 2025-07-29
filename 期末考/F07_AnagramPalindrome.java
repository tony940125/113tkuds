import java.util.*;

public class F07_AnagramPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().toLowerCase(); // 忽略大小寫

        int[] freq = new int[26]; // 僅統計英文字母

        for (char ch : input.toCharArray()) {
            if (Character.isLetter(ch)) {
                freq[ch - 'a']++;
            }
        }

        int oddCount = 0;
        for (int count : freq) {
            if (count % 2 == 1) oddCount++;
        }

        // 最多一個字母可以出現奇數次（回文中心）
        if (oddCount <= 1) {
            System.out.println("Possible");
        } else {
            System.out.println("Impossible");
        }
    }
}
