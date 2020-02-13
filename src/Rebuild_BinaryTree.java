import java.util.Arrays;

public class Rebuild_BinaryTree {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }


    public static TreeNode reConstructBinaryTree(int [] pre,int [] in) {

        int root = pre[0];
        int lsub_len = 0;
        int rsub_len = 0;

        for (int i = 0; i < pre.length; i++){
            if (root == in[i]){
                lsub_len = i;
                rsub_len = pre.length - i - 1;
                break;
            }
        }

        int[] pre_l = new int[lsub_len];
        int[] in_l = new int[lsub_len];
        int[] pre_r = new int[rsub_len];
        int[] in_r = new int[rsub_len];

        for (int i = 1; i < lsub_len + 1; i++)
            pre_l[i - 1] = pre[i];
        for (int i = lsub_len + 1; i < pre.length; i++)
            pre_r[i - lsub_len - 1] = pre[i];
        for (int i = 0; i < lsub_len; i++)
            in_l[i] = in[i];
        for (int i = lsub_len + 1; i < in.length; i++)
            in_r[i - lsub_len - 1] = in[i];

        TreeNode ret_tree = new TreeNode(root);

        if (pre_l.length == 0 || in_l.length == 0)
            ret_tree.left = null;
        else
            ret_tree.left = reConstructBinaryTree(pre_l, in_l);

        if (pre_r.length == 0 || in_r.length == 0)
            ret_tree.right = null;
        else
            ret_tree.right = reConstructBinaryTree(pre_r, in_r);

        return ret_tree;
    }

    public static void main(String[] args) {
        int[] pre = new int[]{1,2,4,3,5,6};
        int[] in = new int[]{2,4,1,5,6,3};
        TreeNode get = reConstructBinaryTree(pre, in);
    }
}
