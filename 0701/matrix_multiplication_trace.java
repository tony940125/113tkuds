public class matrix_multiplication_trace {
    public static void main(String[] args) {
        // 寫死矩陣內容
        int[][] a = {{1, 2}, {3, 4}};
        int[][] b = {{5, 6}, {7, 8}};
        int[][] c = new int[2][2]; // 結果矩陣

        // 三層迴圈進行乘法運算
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                int sum = 0;
                StringBuilder step = new StringBuilder();
                step.append("計算位置 c[").append(i).append("][").append(j).append("]：");

                for (int k = 0; k < 2; k++) {
                    int product = a[i][k] * b[k][j];
                    sum += product;
                    step.append(a[i][k]).append("*").append(b[k][j]);
                    if (k < 1) step.append(" + ");
                }

                step.append(" = ").append(a[i][0] * b[0][j])
                    .append(" + ").append(a[i][1] * b[1][j])
                    .append(" = ").append(sum);

                System.out.println(step);
                c[i][j] = sum;
            }
        }

        // 輸出結果矩陣
        System.out.println("結果矩陣：");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
