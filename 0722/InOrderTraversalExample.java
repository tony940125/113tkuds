// 定義二元樹節點
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class InOrderTraversalExample {
    public static void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        // 左
        inOrder(root.left);
        // 根
        System.out.print(root.val + " ");
        // 右
        inOrder(root.right);
    }

    public static void main(String[] args) {
        // 建立測試用樹：
        //     1
        //    / \
        //   2   3
        //  / \
        // 4   5
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        System.out.print("In-order traversal: ");
        inOrder(root);  // 預期輸出：4 2 5 1 3
    }
}
