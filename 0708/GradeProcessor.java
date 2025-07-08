public class GradeProcessor {
    public static void main(String[] args) {
        // 1. 建立成績陣列
        int[] grades = {78, 85, 92, 67, 88, 95, 73, 90};

        // 2. 計算總分與平均分（保留兩位小數）
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        double average = (double) sum / grades.length;
        System.out.printf("總分: %d\n", sum);
        System.out.printf("平均分數: %.2f\n", average);

        // 3. 找出最高分與最低分及其索引
        int max = grades[0], min = grades[0];
        int maxIndex = 0, minIndex = 0;
        for (int i = 1; i < grades.length; i++) {
            if (grades[i] > max) {
                max = grades[i];
                maxIndex = i;
            }
            if (grades[i] < min) {
                min = grades[i];
                minIndex = i;
            }
        }
        System.out.println("最高分: " + max + "（學生編號: " + maxIndex + "）");
        System.out.println("最低分: " + min + "（學生編號: " + minIndex + "）");

        // 4. 計算高於平均分的學生人數
        int countAboveAverage = 0;
        for (int grade : grades) {
            if (grade > average) {
                countAboveAverage++;
            }
        }
        System.out.println("高於平均分的學生人數: " + countAboveAverage);

        // 5. 輸出所有成績（學生編號: 成績）
        System.out.println("所有學生成績:");
        for (int i = 0; i < grades.length; i++) {
            System.out.println("學生編號 " + i + ": " + grades[i]);
        }
    }
}
