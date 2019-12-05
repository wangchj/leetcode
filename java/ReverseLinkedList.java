/**
 * Author: Chih-Jye Wang
 * Date  : Oct 11, 2015
 *
 * Reverse a singly linked list.
 *
 * Hint:
 * A linked list can be reversed either iteratively or recursively. Could you implement both?
 */

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode r = null, p = head;
        while(p != null) {
            ListNode t = p;
            p = p.next;
            t.next = r;
            r = t;
        }
        return r;
    }
}