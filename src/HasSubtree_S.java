import javax.transaction.TransactionRequiredException;

public class HasSubtree_S {

    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }


    public String getPreorder(TreeNode tree, String preOrder){
        if (tree == null)
            return preOrder;
        preOrder += "" + tree.val;
        preOrder = getPreorder(tree.left, preOrder);
        preOrder = getPreorder(tree.right, preOrder);
        return preOrder;
    }

    public String getInorder(TreeNode tree, String inOrder){
        if (tree == null)
            return inOrder;
        inOrder = getInorder(tree.left, inOrder);
        inOrder += "" + tree.val;
        inOrder = getInorder(tree.right, inOrder);
        return inOrder;
    }

    public String getPostorder(TreeNode tree, String postOrder){
        if (tree == null)
            return postOrder;
        postOrder = getPostorder(tree.left, postOrder);
        postOrder = getPostorder(tree.right, postOrder);
        postOrder += "" + tree.val;
        return postOrder;
    }


    public boolean HasSubtree(TreeNode root1, TreeNode root2) {
        if (root1 == null || root2 == null) {
            return false;
        }
        return judgeSubTree(root1, root2) ||
                judgeSubTree(root1.left, root2) ||
                judgeSubTree(root1.right, root2);
    }

    private boolean judgeSubTree(TreeNode root1, TreeNode root2) {
        if (root2 == null) {
            return true;
        }
        if (root1 == null) {
            return false;
        }
        if (root1.val != root2.val) {
            return false;
        }
        return judgeSubTree(root1.left, root2.left) &&
                judgeSubTree(root1.right, root2.right);
    }

    public static void main(String[] args) {
        HasSubtree_S has_s = new HasSubtree_S();

        TreeNode test = new TreeNode(1);
        test.left = new TreeNode(2);
        test.left.left = new TreeNode(4);
        test.right = new TreeNode(3);
        test.right.left = new TreeNode(5);
        test.right.right = new TreeNode(6);

        TreeNode sub = new TreeNode(1);
        sub.left = new TreeNode(2);
        sub.right = new TreeNode(3);

        System.out.println(has_s.HasSubtree(test, sub));




//        String pre = has_s.getPreorder(test, "");
//        String in = has_s.getInorder(test, "");
//        String post = has_s.getPostorder(test, "");
//        System.out.println(pre);
//        System.out.println(in);
//        System.out.println(post);
    }
}
