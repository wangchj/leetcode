/**
 * Author: Chih-Jye Wang
 * Date  : Feb 12, 2015
 *
 * Given a sorted linked list, delete all duplicates such that each element appear only once.
 *
 * For example,
 * Given 1->1->2, return 1->2.
 * Given 1->1->2->3->3, return 1->2->3.
 */
public class RemoveDuplicatesFromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode front = head;
        ListNode rear  = head;
        while(front != null) {
            if(rear == null || front.val != rear.val) {
                front.next = rear;
                front = rear;    
            }
            else
                rear = rear.next;
        }
        return head;
    }
}