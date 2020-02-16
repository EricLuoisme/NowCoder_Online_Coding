public class IsBalancedBT {

    // a balenced binary tree: can be an empty tree, or left & right subtree's
    // height would not greater than 1

    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;
        public TreeNode(int val) {
            this.val = val;
        }
    }

    public boolean IsBalanced_Solution(TreeNode root) {
        return depth(root) != -1;
    }

    public int depth(TreeNode root){

        if (root == null)
            return 0;

        int left = depth(root.left);
        if (left == -1)
            return -1;

        int right = depth(root.right);
        if (right == -1)
            return -1;

        if (left - right < (-1) || left - right > 1)
            return -1;
        else
            return 1 + (left > right ? left : right);
    }
}
