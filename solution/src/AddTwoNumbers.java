/**
 * Created by luke on 2018/9/6.
 */
public class AddTwoNumbers {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int flag = 0;
        ListNode head = new ListNode(0);
        ListNode current = head;
        while (l1 != null || l2 != null || flag > 0) {
            int num1 = l1 == null ? 0 : l1.val;
            int num2 = l2 == null ? 0 : l2.val;
            int sum = num1 + num2 + flag;
            ListNode newNode = new ListNode(sum % 10);
            flag = sum / 10;
            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;
            current.next = newNode;
            current = current.next;
        }
        return head.next;
    }
}
