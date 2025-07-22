public class CheckSortedExample {
    public static boolean isSorted(int[] arr, int index) {
         // 終止條件：如果到達陣列最後一個元素，表示已經檢查完畢，回傳 true
        if (index == arr.length - 1) {
            return true;
        }
        // 如果當前元素大於下一個元素，表示不是升序，回傳 false
        if (arr[index] > arr[index + 1]) {
            return false;
        }
        // 遞迴檢查下一個索引
        return isSorted(arr, index + 1);
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {5, 3, 4, 2, 1};

        System.out.println("arr1 is sorted: " + isSorted(arr1, 0));  // true
        System.out.println("arr2 is sorted: " + isSorted(arr2, 0));  // false
    }
}
