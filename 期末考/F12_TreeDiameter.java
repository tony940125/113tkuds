import java.util.*;

public class F12_TreeDiameter {

    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int val) {
            this.val = val;
        }
    }

    static class Result {
        int diameter = 0;
    }

    // 建立二元樹（層序輸入，-1 表 null）
    public static TreeNode buildTree(String[] data) {
        if (data.length == 0 || data[0].equals("-1")) return null;

        TreeNode root = new TreeNode(Integer.parseInt(data[0]));
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int i = 1;

        while (i < data.length) {
            TreeNode current = queue.poll();

            // 左子節點
            if (i < data.length && !data[i].equals("-1")) {
                current.left = new TreeNode(Integer.parseInt(data[i]));
                queue.offer(current.left);
            }
            i++;

            // 右子節點
            if (i < data.length && !data[i].equals("-1")) {
                current.right = new TreeNode(Integer.parseInt(data[i]));
                queue.offer(current.right);
            }
            i++;
        }

        return root;
    }

    // 計算直徑（回傳高度的同時更新直徑）
    public static int dfs(TreeNode node, Result res) {
        if (node == null) return 0;

        int left = dfs(node.left, res);
        int right = dfs(node.right, res);

        res.diameter = Math.max(res.diameter, left + right); // 經過該節點的最長路徑
        return Math.max(left, right) + 1; // 回傳該節點的高度
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nodes = sc.nextLine().split(" ");
        TreeNode root = buildTree(nodes);

        Result res = new Result();
        dfs(root, res);
        System.out.println("Diameter: " + res.diameter);
    }
}
