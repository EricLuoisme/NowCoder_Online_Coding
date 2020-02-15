public class VerifySquenceOfBST_S {

    public boolean VerifySquenceOfBST(int [] sequence) {
        if (sequence.length == 0 || sequence == null)
            return false;
        return BST_Check(sequence, 0, sequence.length - 1);
    }

    public boolean BST_Check(int[] sequence, int start, int end){
        if (start >= end)
            return true;

        int root = sequence[end];
        int split = start;
        while (sequence[split] < root && split < end)
            split++;

        for (int i = split; i < end; i++){
            if (sequence[i] < root)
                return false;
        }

        return BST_Check(sequence, start, split - 1) && BST_Check(sequence, split, end - 1);
    }

    public static void main(String[] args) {

        VerifySquenceOfBST_S use = new VerifySquenceOfBST_S();
        int[] test = new int[]{2, 5, 8, 11, 2, 12, 10};
        System.out.println(use.VerifySquenceOfBST(test));

    }

}
