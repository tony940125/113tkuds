public class ArraySearcher {

    // 2. 搜尋指定數值的方法
    public static int findElement(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i; // 找到，回傳索引
            }
        }
        return -1; // 沒找到
    }

    // 4. 計算出現次數的方法
    public static int countOccurrences(int[] array, int target) {
        int count = 0;
        for (int num : array) {
            if (num == target) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        // 1. 建立陣列
        int[] data = {12, 45, 23, 67, 34, 89, 56, 78, 91, 25};

        // 5. 測試搜尋數字 67 和 100，並輸出結果
        int target1 = 67;
        int target2 = 100;

        // 測試 findElement
        int index1 = findElement(data, target1);
        int index2 = findElement(data, target2);

        System.out.println("搜尋數字 " + target1 + " 的結果: " +
            (index1 != -1 ? "找到，索引為 " + index1 : "未找到"));
        System.out.println("搜尋數字 " + target2 + " 的結果: " +
            (index2 != -1 ? "找到，索引為 " + index2 : "未找到"));

        // 測試 countOccurrences
        System.out.println("數字 " + target1 + " 出現次數: " + countOccurrences(data, target1));
        System.out.println("數字 " + target2 + " 出現次數: " + countOccurrences(data, target2));
    }
}
