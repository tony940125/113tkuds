import java.util.*;

public class F11_BSTClosestValue {

    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int val) {
            this.val = val;
        }
    }

    // 插入節點進 BST
    public static TreeNode insert(TreeNode root, int val) {
        if (root == null) return new TreeNode(val);
        if (val < root.val) root.left = insert(root.left, val);
        else root.right = insert(root.right, val);
        return root;
    }

    // 尋找與目標最接近的節點值（迭代法）
    public static int closestValue(TreeNode root, int target) {
        int closest = root.val;

        while (root != null) {
            int diff = Math.abs(root.val - target);
            int closestDiff = Math.abs(closest - target);

            if (diff < closestDiff || (diff == closestDiff && root.val < closest)) {
                closest = root.val;
            }

            // BST 性質：決定往哪邊走
            if (target < root.val) {
                root = root.left;
            } else if (target > root.val) {
                root = root.right;
            } else {
                break; // 完全相等，提前結束
            }
        }

        return closest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 輸入節點數與 BST 數列
        int n = sc.nextInt();
        TreeNode root = null;
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            root = insert(root, val);
        }

        // 輸入目標 T
        int target = sc.nextInt();

        int result = closestValue(root, target);
        System.out.println("Closest: " + result);
    }
}
