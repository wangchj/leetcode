/**
 * Author: Chih-Jye Wang
 * Date  : Dec 16, 2013
 *
 * Given a sorted linked list, delete all duplicates such that each element appear only once.
 *
 * For example,
 * Given 1->1->2, return 1->2.
 * Given 1->1->2->3->3, return 1->2->3.
 */
public class RemoveDuplicateFromSortedList
{
    public ListNode deleteDuplicates(ListNode head)
    {
        if(head == null)
            return null;
        ListNode start = head, end = head;
        while(end != null)
        {
            if(start.val == end.val)
                end = end.next;
            else
            {
                start.next = end;
                start = end;
            }
        }
        start.next = null;
        return head;
    }
}