public class FindKthToTail_S {
    public static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode FindKthToTail(ListNode head,int k) {
        ListNode fast = head;
        ListNode slow = head;

        for (int i = 0; i < k; i++){
            fast = fast.next; // let fast and slow's interval become k
        }

        while (fast != null){
            fast = fast.next;
            slow = slow.next;
        }

        return slow;
    }


    public static void main(String[] args) {
        FindKthToTail_S test = new FindKthToTail_S();
        ListNode head = new ListNode(100);
    }
}
