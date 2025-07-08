public class ArrayStatistics {

    public static void main(String[] args) {
        // 1. 建立陣列
        int[] data = {5, 12, 8, 15, 7, 23, 18, 9, 14, 6};

        // 2. 統計變數
        int sum = 0;
        double average;
        int max = data[0], min = data[0];
        int maxIndex = 0, minIndex = 0;
        int countAboveAverage = 0;
        int evenCount = 0, oddCount = 0;

        // 總和、最大值、最小值
        for (int i = 0; i < data.length; i++) {
            sum += data[i];
            if (data[i] > max) {
                max = data[i];
                maxIndex = i;
            }
            if (data[i] < min) {
                min = data[i];
                minIndex = i;
            }

            // 偶數與奇數判斷
            if (data[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        average = (double) sum / data.length;

        // 計算大於平均值的數字個數
        for (int value : data) {
            if (value > average) {
                countAboveAverage++;
            }
        }

        // 3. 輸出統計結果（表格形式）
        System.out.println("==== 陣列統計分析結果 ====");
