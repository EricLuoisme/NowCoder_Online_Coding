import javafx.util.Pair;

import javax.transaction.TransactionRequiredException;
import java.util.ArrayList;
import java.util.Stack;

public class FindPath_Sum {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    private ArrayList<ArrayList<Integer>> result = new ArrayList<>();
    private ArrayList<Integer> one_path = new ArrayList<>();

    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {

        if (root == null || target == 0 || root.val > target)
            return result;

        one_path.add(root.val);
        target -= root.val;

        if (target == 0 && root.left == null && root.right == null)
            result.add(new ArrayList<Integer>(one_path));

        FindPath(root.left, target);
        FindPath(root.right, target);
        one_path.remove(one_path.size() - 1);

        return this.result;
    }


}
