package com.nitrohsu.leetcodefor.algo;

import com.nitrohsu.leetcodefor.Solution;
import com.nitrohsu.leetcodefor.model.ListNode;

import java.util.Stack;

/**
 * 压栈、倒序出栈-Copy from
 * https://leetcode.com/problems/add-two-numbers-ii/discuss/322543/Java-solution
 * <p>
 * Created by N2Hsu on 6/6/2019.
 */
public class _445 extends Solution {

    public _445() {
        super(445, "AddTwoNumbers");
    }

    @Override
    public void run() {

        ListNode head = new ListNode(7);
        head.next = new ListNode(2);
        head.next.next = new ListNode(4);
        head.next.next.next = new ListNode(3);

        ListNode tail = new ListNode(5);
        tail.next = new ListNode(6);
        tail.next.next = new ListNode(4);

        input(head);
        input(tail);

        ListNode result = addTwoNumbers(head, tail);
        output(result);
    }


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        Stack<Integer> l1Stack = new Stack<>();
        while (l1 != null) {
            l1Stack.push(l1.val);
            l1 = l1.next;
        }

        Stack<Integer> l2Stack = new Stack<>();
        while (l2 != null) {
            l2Stack.push(l2.val);
            l2 = l2.next;
        }

        int sum = 0;
        ListNode head = null, node = null;
        while (!l1Stack.empty() || !l2Stack.empty()) {

            if (!l1Stack.empty()) {
                sum += l1Stack.pop();
            }
            if (!l2Stack.empty()) {
                sum += l2Stack.pop();
            }

            if (node == null) {
                node = new ListNode(sum % 10);
            } else {
                node.val = sum % 10;
            }
            head = new ListNode(sum / 10);
            head.next = node;
            node = head;

            sum = sum / 10;
        }

        return head.val == 0 ? head.next : head;
    }
}
