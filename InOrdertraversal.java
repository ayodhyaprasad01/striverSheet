class TreeNode {
    int val;
    TreeNode left = null, right = null;

    TreeNode(int val) {
        this.val = val;

    }
}

public class InOrdertraversal {

    public static void inOrdertraversal(TreeNode root) {
        if (root == null) {
            return;
        }

        inOrdertraversal(root.left);
        System.out.println(root.val);
        inOrdertraversal(root.right);
    }

    public static void main(String[] args) {
        // Create a binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
      

        inOrdertraversal(root);

    }
}
