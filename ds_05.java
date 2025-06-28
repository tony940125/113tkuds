// 檔名：ds_05.java
public class ds_05 {
    public static void main(String[] args) {
        // 建立並初始化一個包含 10 個整數的陣列
        int[] numbers = {5, 8, 12, 3, 7, 9, 10, 15, 6, 4};

        // 計算總和
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        // 輸出總和
        System.out.println("陣列所有元素的總和為：" + sum);
    }
}
