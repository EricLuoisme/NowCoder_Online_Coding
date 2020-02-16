public class TreeDepth_S {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }
    }

    private int max_depth = 0;
    private int cur_depth = 0;

    public int TreeDepth(TreeNode root) {
        RecTrace(root);
        return this.max_depth;
    }

    public void RecTrace(TreeNode root){
        if (root != null){
            this.cur_depth++;
            if (this.cur_depth > this.max_depth)
                this.max_depth = this.cur_depth;
            RecTrace(root.left);
            RecTrace(root.right);
            this.cur_depth--;
        }
    }

}
