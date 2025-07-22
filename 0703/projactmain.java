import java.util.Scanner;

public class projactmain {
    public static void main(String[] args) {
        // 建立 Scanner 物件以讀取使用者輸入
        Scanner scanner = new Scanner(System.in);

        // 讀取一行輸入（使用者輸入的姓名）
        String name = scanner.nextLine();

        // 輸出姓名
        System.out.println(name);
    }
}
