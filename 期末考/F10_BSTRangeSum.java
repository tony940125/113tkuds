import java.util.*;

public class F10_BSTRangeSum {

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

    // 區間總和（中序剪枝）
    public static int rangeSum(TreeNode root, int L, int R) {
        if (root == null) return 0;

        int sum = 0;

        if (root.val > L) {
            sum += rangeSum(root.left, L, R);  // 左子樹可能有值落在區間內
        }

        if (root.val >= L && root.val <= R) {
            sum += root.val;  // 自己在區間內
        }

        if (root.val < R) {
            sum += rangeSum(root.right, L, R); // 右子樹可能有值落在區間內
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 讀取節點數與 BST 數列
        int n = sc.nextInt();
        TreeNode root = null;
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            root = insert(root, val);
        }

        // 讀取區間 [L, R]
        int L = sc.nextInt();
        int R = sc.nextInt();

        int result = rangeSum(root, L, R);
        System.out.println("Sum: " + result);
    }
}
