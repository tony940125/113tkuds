// 定義鏈結串列節點
class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class ReversePrintExample {
    public static void printReverse(ListNode head) {
        if (head == null) {
            return;
        }
        // 先遞迴到串列尾端
        printReverse(head.next);
        // 然後再列印當前節點
        System.out.print(head.val + " ");
    }

    public static void main(String[] args) {
        // 建立測試用串列：1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.print("Reverse print: ");
        printReverse(head);  // 預期輸出：5 4 3 2 1
    }
}
