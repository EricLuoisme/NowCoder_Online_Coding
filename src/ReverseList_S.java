import sun.awt.image.ImageWatched;

import java.util.List;

public class ReverseList_S {
    public static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode ReverseList(ListNode head) {

        ListNode pre = null;
        ListNode next = null;

        while (head != null){
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }

        return pre;
    }
}
