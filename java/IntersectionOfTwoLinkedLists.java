/**
 * Author: Chih-Jye Wang
 * Date  : Dec 26, 2014
 *
 * Write a program to find the node at which the intersection of two singly linked lists begins.
 *
 *
 * For example, the following two linked lists:
 *
 *     A:          a1 → a2
 *                        \
 *                         c1 → c2 → c3
 *                        /            
 *     B:     b1 → b2 → b3
 *
 * begin to intersect at node c1.
 *
 * Notes:
 * - If the two linked lists have no intersection at all, return null.
 * - The linked lists must retain their original structure after the function returns.
 * - You may assume there are no cycles anywhere in the entire linked structure.
 * - Your code should preferably run in O(n) time and use only O(1) memory.
 */
public class IntersectionOfTwoLinkedLists
{
    public ListNode getIntersectionNode(ListNode headA, ListNode headB)
    {
        int lenA = getLength(headA);
        int lenB = getLength(headB);
        
        if(lenA == 0 || lenB == 0)
            return null;
        
        int diff = Math.abs(lenA - lenB);
        
        //If A is longer than B, fast forward A
        if(lenA > lenB)
            headA = fastforward(headA, diff);
        if(lenA < lenB)
            headB = fastforward(headB, diff);
        
        for(; headA != null && headB != null; headA = headA.next, headB = headB.next)
            if(headA == headB)
                return headA;
        
        return null;
    }
    
    public static int getLength(ListNode head)
    {
        int res = 0;
        for(ListNode node = head; node != null; node = node.next)
            res++;
        return res;
    }
    
    public static ListNode fastforward(ListNode head, int count)
    {
        for(int i = 0; i < count; i++)
            head = head.next;
        return head;
    }
}