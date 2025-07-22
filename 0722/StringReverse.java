import java.util.Scanner;

public class StringReverse {
    
    // 遞迴反轉字串
    public static String reverseString(String str) {
        if (str == null || str.length() <= 1) {
            return str;
        }
        return str.charAt(str.length() - 1) +
               reverseString(str.substring(0, str.length() - 1));
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("請輸入要反轉的字串：");
        String input = scanner.nextLine();
        
        // 呼叫遞迴方法
        String output = reverseString(input);
        
        System.out.println("反轉後結果： " + output);
        
        scanner.close();
    }
}