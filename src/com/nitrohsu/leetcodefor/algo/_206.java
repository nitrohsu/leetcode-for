package com.nitrohsu.leetcodefor.algo;

import com.nitrohsu.leetcodefor.Solution;
import com.nitrohsu.leetcodefor.model.ListNode;

/**
 * Created by N2Hsu on 6/10/2019.
 */
public class _206 extends Solution {
    public _206() {
        super(206, "ReverseLinkedList");
    }

    @Override
    public void run() {

        ListNode head = new ListNode(1);
        head.next = new ListNode(4);
        head.next.next = new ListNode(3);

        input(head);

        output(reverseList(head));
//        output(reverseListIterator(head));
    }

    public ListNode tmp;

    public ListNode reverseList(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode prev = head;
        ListNode cur = head.next;
        ListNode tmp;
        while (cur != null) {
            tmp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = tmp;
        }
        head.next = null;
        return prev;
    }

    /**
     * 递归方式：实现单链表反转
     */
    ListNode reverseListIterator(ListNode head) {
        if (head == null || head.next == null)
            return head;
        else {
            ListNode newhead = reverseListIterator(head.next);//先反转后面的链表，从最后面的两个结点开始反转，依次向前
            head.next.next = head;//将后一个链表结点指向前一个结点
            head.next = null;//将原链表中前一个结点指向后一个结点的指向关系断开
            return newhead;
        }
    }

}
