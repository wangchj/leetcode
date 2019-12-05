/**
 * Author:  Chih-Jye Wang
 * Date:    Dec 11, 2013
 *
 * Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.
 * 
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class MergeTwoSortedLists
{
    public ListNode mergeTwoLists(ListNode l1, ListNode l2)
    {
        if(l1 == null && l2 == null)
            return null;
        if(l1 == null && l2 != null)
            return l2;
        if(l1 != null && l2 == null)
            return l1;
      
        //Result list
        ListNode r = l1.val <= l2.val ? l1 : l2;
        //Previous nodes
        ListNode p1 = null, p2 = null;

        while(l1 != null && l2 != null)
        {
            if(l1.val <= l2.val)
            {
                ListNode temp = l1.next;
                if(p2 != null)
                    p2.next = l1;
                l1.next	= p1 = l2;
                p2 = l1;
                l1 = temp;
            }
            else
            {
                ListNode temp = l2.next;
                if(p1 != null)
                    p1.next = l2;
                l2.next = p2 = l1;
                p1 = l2;
                l2 = temp;
            }
        }
      
        return r;         
    }
}
