import java.util.*;

public class BreadFirstSearch {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }
    }

    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        if (pRoot == null)
            return result;

        LinkedList<TreeNode> queue = new LinkedList<>();
        HashMap<TreeNode, Integer> heights = new HashMap<>();
        queue.add(pRoot);
        heights.put(pRoot, 0);

        while (!queue.isEmpty()){
            TreeNode cur = queue.removeFirst();
            if (cur.left != null){
                queue.addLast(cur.left);
                heights.put(cur.left, heights.get(cur) + 1);
            }
            if (cur.right != null){
                queue.addLast(cur.right);
                heights.put(cur.right, heights.get(cur) + 1);
            }

            ////// here is the most imp stuff
            if (result.size() <= heights.get(cur)){
                ArrayList<Integer> list = new ArrayList<>();
                list.add(cur.val);
                result.add(list);
            } else {
                ArrayList<Integer> list = result.get(heights.get(cur));
                list.add(cur.val);
            }
        }
        return result;
    }
}
