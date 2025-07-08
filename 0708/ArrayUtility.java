import java.util.Arrays;

public class ArrayUtility {

    // 列印陣列內容
    public static void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    // 原地反轉陣列
    public static void reverseArray(int[] array) {
        int left = 0, right = array.length - 1;
        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }

    // 複製陣列
    public static int[] copyArray(int[] array) {
        return Arrays.copyOf(array, array.length);
    }

    // 找出第二大的數值
    public static int findSecondLargest(int[] array) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int num : array) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }
        return second;
    }

    public static void main(String[] args) {
        // 1. 建立陣列
        int[] data = {3, 7, 1, 9, 4, 6, 8, 2, 5};

        // 測試 printArray
        System.out.print("原始陣列：");
        printArray(data);

        // 測試 reverseArray
        reverseArray(data);
        System.out.print("反轉後陣列：");
        printArray(data);

        // 測試 copyArray
        int[] copied = copyArray(data);
        System.out.print("複製的陣列：");
        printArray(copied);

        // 測試 findSecondLargest
        int secondLargest = findSecondLargest(data);
        System.out.println("第二大的數值為：" + secondLargest);
    }
}
