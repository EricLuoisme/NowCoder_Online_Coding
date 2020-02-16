import java.util.HashSet;

public class FindIntersectionTwoLinkedList {

    public class ListNode {
        int val;
        ListNode next = null;
        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        HashSet<ListNode> firstList = new HashSet<>();
        while (pHead1 != null){
            firstList.add(pHead1);
            pHead1 = pHead1.next;
        }
        while (pHead2 != null){
            if (firstList.contains(pHead2))
                return pHead2;
            pHead2 = pHead2.next;
        }
        return null;
    }
}
