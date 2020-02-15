import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BTS {

    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }
    }

    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {

        ArrayList<Integer> list = new ArrayList<>();
        if (root == null)
            return list;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()){
            TreeNode this_one = queue.remove();
            list.add(this_one.val);
            if (this_one.left != null)
                queue.add(this_one.left);
            if (this_one.right != null)
                queue.add(this_one.right);
        }
        return list;
    }

    public static void main(String[] args) {

        BTS use = new BTS();

        TreeNode test = new TreeNode(1);
        test.left = new TreeNode(2);
        test.left.left = new TreeNode(4);
        test.right = new TreeNode(3);
        test.right.left = new TreeNode(5);
        test.right.right = new TreeNode(6);

        System.out.println(use.PrintFromTopToBottom(test));
    }
}
