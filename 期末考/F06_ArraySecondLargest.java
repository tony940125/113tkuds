import java.util.*;

public class F06_ArraySecondLargest {

    // 回傳一組 pair：int[0] 為最大值，int[1] 為第二大值
    public static int[] findSecondMax(int[] arr, int left, int right) {
        if (left == right) {
            return new int[]{arr[left], Integer.MIN_VALUE}; // 單一元素，無 second
        }

        int mid = (left + right) / 2;
        int[] leftPair = findSecondMax(arr, left, mid);
        int[] rightPair = findSecondMax(arr, mid + 1, right);

        int max, second;

        if (leftPair[0] > rightPair[0]) {
            max = leftPair[0];
            second = Math.max(leftPair[1], rightPair[0]);
        } else {
            max = rightPair[0];
            second = Math.max(rightPair[1], leftPair[0]);
        }

        return new int[]{max, second};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] result = findSecondMax(arr, 0, n - 1);
        System.out.println("SecondMax: " + result[1]);
    }
}

/*
 * Time Complexity: O(n)
 * 說明：分治法遞迴遍歷所有元素，合併時僅進行常數次比較，因此整體仍為線性時間。
 */
