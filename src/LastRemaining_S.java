import java.util.ArrayList;

public class LastRemaining_S {

    class ListNode {

        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public int LastRemaining_Solution(int n, int m) {
        if (n <= 0 || m <= 1 || m - 1 > n)
            return -1;

        ListNode head = new ListNode(0);
        ListNode cur = head;
        for (int i = 1; i < n; i++) {
            cur.next = new ListNode(i);
            cur = cur.next;
        }
        cur.next = head;

        int pointer = 0;
        while (cur.next != cur){
            if (pointer + 1 == m){
                cur.next = cur.next.next;
                pointer = 0;
            } else {
                cur = cur.next;
            }
            pointer++;
        }

        return cur.val;
    }

    public int Add(int num1,int num2) {
        while (num2 != 0) {
            int temp = num1 ^ num2;
            num2 = (num1 & num2) << 1;
            num1 = temp;
            System.out.println();
        }
        return num1;
    }

    public static void main(String[] args) {
        LastRemaining_S test = new LastRemaining_S();
        test.Add(1, 2);
    }

}
