/**
 * Author: Chih-Jye Wang
 * Date  : Jan 16, 2014
 *
 * Given a linked list, remove the nth node from the end of list and return its head.
 * For example,
 *    Given linked list: 1->2->3->4->5, and n = 2.
 *
 *    After removing the second node from the end, the linked list becomes 1->2->3->5.
 * 
 * Note:
 * Given n will always be valid.
 * Try to do this in one pass.
 */

import java.util.ArrayList;

public class RemoveNthNodeFromEndOfList
{
    public ListNode removeNthFromEnd(ListNode head, int n)
    {
        ArrayList<ListNode> list = new ArrayList<ListNode>();
        
        //Add each node to the ArrayList
        for(; head != null; head = head.next)
            list.add(head);
        
        //Remove nth element from end
        if(list.size() > 1)
        {
            //If remove the head of the list, then return the 2nd element
            if(list.size() - n == 0)
                return list.get(1);
            //Else if remove the tail of the list
            if(n == 1)
            {
                list.get(list.size() - 2).next = null;
                return list.get(0);
            }
            //Else, re-link
            ListNode pre = list.get(list.size() - n - 1);
            ListNode nxt = list.get(list.size() - n + 1);
            pre.next = nxt;
            return list.get(0); 
        }
        else
        {
            return null;
        }
    }
}