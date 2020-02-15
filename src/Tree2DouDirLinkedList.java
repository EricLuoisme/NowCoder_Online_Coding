import java.util.ArrayList;

public class Tree2DouDirLinkedList {

    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }
    }

    public TreeNode Convert(TreeNode pRootOfTree) {
        if (pRootOfTree == null)
            return null;

        ArrayList<TreeNode> list = new ArrayList<>();
        InOrder(pRootOfTree, list);
        return buildPointer(list);
    }

    public void InOrder (TreeNode eleNode, ArrayList<TreeNode> list){
        if (eleNode == null)
            return;
        InOrder(eleNode.left, list);
        list.add(eleNode);
        InOrder(eleNode.right, list);
    }

    public TreeNode buildPointer(ArrayList<TreeNode> list){
        for (int i = 0; i < list.size() - 1; i++){
            list.get(i).right = list.get(i + 1);
            list.get(i + 1).left = list.get(i);
        }
        return list.get(0);
    }

}
