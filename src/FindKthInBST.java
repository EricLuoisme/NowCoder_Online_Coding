public class FindKthInBST {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }
    }

    private int kth;

    TreeNode KthNode(TreeNode pRoot, int k) {
        this.kth = k;
        return inOrder(pRoot);
    }

    public TreeNode inOrder(TreeNode root) {
        if (root != null){

            TreeNode temp = null;
            if (  (temp = inOrder(root.left)) != null )
                return temp;
            if (--this.kth == 0)
                return root;
            if ( (temp = inOrder(root.right)) != null )
                return temp;
        }
        return null;
    }
}
