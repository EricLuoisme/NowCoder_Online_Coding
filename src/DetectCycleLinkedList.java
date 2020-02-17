import sun.awt.image.ImageWatched;

public class DetectCycleLinkedList {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode EntryNodeOfLoop(ListNode pHead) {
        if (pHead == null || pHead.next == null)
            return null;

        ListNode fast = pHead;
        ListNode slow = pHead;

        while (slow != null || slow.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow){
                ListNode slow_2 = pHead;
                while (slow != slow_2){
                    slow = slow.next;
                    slow_2 = slow_2.next;
                }
                return slow;
            }
        }
        return null;
    }
}
