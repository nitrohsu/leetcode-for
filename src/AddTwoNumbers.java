import model.ListNode;

/**
 * Created by N2Hsu on 6/6/2019.
 */
public class AddTwoNumbers {

    public static void main(String[] args) {

        ListNode head = new ListNode(1);
//        head.next = new ListNode(4);
//        head.next.next = new ListNode(3);

        ListNode tail = new ListNode(9);
        tail.next = new ListNode(9);
//        tail.next.next = new ListNode(4);

        ListNode result = new Solution().addTwoNumbers(head, tail);
        while (result != null) {
            System.out.print(result.val + "->");
            result = result.next;
        }
    }


    static class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

            ListNode head = null;
            ListNode current = null;
            while (l1 != null || l2 != null) {
                int count;
                if (l1 == null) {
                    count = l2.val;
                } else if (l2 == null) {
                    count = l1.val;
                } else {
                    count = l1.val + l2.val;
                }

                if (count >= 10) {
                    count = count - 10;

                    if (l1 != null && l1.next != null) {
                        l1.next.val += 1;
                    } else if (l2 != null && l2.next != null) {
                        l2.next.val += 1;
                    } else if (l1 != null) {
                        l1.next = new ListNode(1);
                    } else if (l2 != null) {
                        l2.next = new ListNode(1);
                    }
                }

                if (head == null) {
                    current = head = new ListNode(count);
                } else {
                    current.next = new ListNode(count);
                    current = current.next;
                }

                l1 = l1 != null ? l1.next : null;
                l2 = l2 != null ? l2.next : null;
            }

            return head;
        }
    }
}
