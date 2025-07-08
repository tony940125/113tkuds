public class StudentGradeSystem {

    // 根據分數回傳等級
    public static char getGrade(int score) {
        if (score >= 90) return 'A';
        else if (score >= 80) return 'B';
        else if (score >= 70) return 'C';
        else return 'D';
    }

    // 顯示完整的成績報告
    public static void printGradeReport(int[] scores) {
        int countA = 0, countB = 0, countC = 0, countD = 0;
        int sum = 0;
        int max = scores[0], min = scores[0];
        int maxIndex = 0, minIndex = 0;

        // 第一輪統計總分與最高最低
        for (int i = 0; i < scores.length; i++) {
            int score = scores[i];
            sum += score;
            if (score > max) {
                max = score;
                maxIndex = i;
            }
            if (score < min) {
                min = score;
                minIndex = i;
            }

            // 統計各等級人數
            switch (getGrade(score)) {
                case 'A': countA++; break;
                case 'B': countB++; break;
                case 'C': countC++; break;
                case 'D': countD++; break;
            }
        }

        double average = (double) sum / scores.length;

        // 計算高於平均的人數
        int aboveAverageCount = 0;
        for (int score : scores) {
            if (score > average) {
                aboveAverageCount++;
            }
        }
        double aboveAverageRatio = (double) aboveAverageCount / scores.length * 100;

        // 顯示報告
        System.out.println("=== 學生成績報告系統 ===");
        System.out.println("分隔線: ===============================");
        System.out.println("成績統計摘要：");
        System.out.printf("最高分：%d（學生編號 %d）\n", max, maxIndex);
        System.out.printf("最低分：%d（學生編號 %d）\n", min, minIndex);
        System.out.printf("平均分：%.2f\n", average);
        System.out.printf("高於平均分人數比例：%.2f%%\n", aboveAverageRatio);
        System.out.println("等級分布：A=" + countA + " B=" + countB + " C=" + countC + " D=" + countD);
        System.out.println("分隔線: ===============================");

        // 詳細列表
        System.out.println("學生成績列表：");
        System.out.printf("%-8s%-8s%-8s\n", "編號", "分數", "等級");
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%-8d%-8d%-8c\n", i, scores[i], getGrade(scores[i]));
        }
        System.out.println("分隔線: ===============================");
    }

    public static void main(String[] args) {
        // 1. 建立學生分數陣列
        int[] scores = {85, 92, 78, 96, 87, 73, 89, 94, 81, 88};

        // 2. 顯示成績報告
        printGradeReport(scores);
    }
}
