public class CloneComplexLinkedList {

    public class RandomListNode {
        int label;
        RandomListNode next = null;
        RandomListNode random = null;

        RandomListNode(int label) {
            this.label = label;
        }
    }

    public RandomListNode Clone(RandomListNode pHead)
    {
        if (pHead == null)
            return null;

        RandomListNode cur = pHead; // 1. add a new node for each node, just next to them.
        while (cur != null){
            RandomListNode clone = new RandomListNode(cur.label);
            RandomListNode cur_next = cur.next;
            cur.next = clone;
            clone.next = cur_next;
            cur = cur_next;
        }

        // 2. add origin node's special pointer
        cur = pHead;
        while (cur != null){
            if (cur.random != null)
                cur.next.random = cur.random.next;
                // need to pay attention, because we need to make the cloned node point to the cloned one
            cur = cur.next.next;
        }

        // 3. cur the clone linked list
        cur = pHead;
        RandomListNode clone_Head = pHead.next;
        while (cur != null){
            RandomListNode otherList = cur.next;
            if (cur.next.next == null){ // for the last second one we reached.
                cur.next = null;
                break;
            }
            cur.next = cur.next.next;
            cur = otherList;
        }

        return clone_Head;
    }
}
