import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class SSS {
    private List<Integer> perfectSubtreeSizes = new ArrayList<>();

    public int kthLargestPerfectSubtree(TreeNode root, int k) {
        findPerfectSubtree(root);
        Collections.sort(perfectSubtreeSizes, Collections.reverseOrder());
        if (k > perfectSubtreeSizes.size())
            return -1;
        return perfectSubtreeSizes.get(k - 1);
    }

    private int findPerfectSubtree(TreeNode node) {
        if (node == null) {
            return 0; // A null node contributes size 0
        }

        int leftSize = findPerfectSubtree(node.left);
        int rightSize = findPerfectSubtree(node.right);

        // Check if the current node forms a perfect subtree
        if (leftSize == rightSize && leftSize > 0) {
            int size = leftSize + rightSize + 1; // Calculate size of the perfect subtree
            perfectSubtreeSizes.add(size); // Add size to the list
            return size; // Return the size of this perfect subtree
        }

        return 0; // Not a perfect subtree
    }

    public TreeNode buildTree(Integer[] values) {
        if (values.length == 0) return null;
        TreeNode root = new TreeNode(values[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        int i = 1;
        while (i < values.length) {
            TreeNode current = queue.poll();
            if (i < values.length && values[i] != null) {
                current.left = new TreeNode(values[i]);
                queue.add(current.left);
            }
            i++;
            if (i < values.length && values[i] != null) {
                current.right = new TreeNode(values[i]);
                queue.add(current.right);
            }
            i++;
        }
        return root;
    }

    public static void main(String[] args) {
        SSS sss = new SSS();

        // Test cases
        Integer[][] inputs = {
                {5, 3, 6, 5, 2, 5, 7, 1, 8},
                {1, 2, 3, 4, 5, 6, 7},
                {1, 2, 3, null, 4}
        };

        int[] ks = {2, 1, 3};

        for (int i = 0; i < inputs.length; i++) {
            TreeNode root = sss.buildTree(inputs[i]);
            int k = ks[i];
            System.out.println("Input: " + Arrays.toString(inputs[i]) + ", k = " + k);
            System.out.println("Output: " + sss.kthLargestPerfectSubtree(root, k));
            System.out.println();
        }
    }
}
