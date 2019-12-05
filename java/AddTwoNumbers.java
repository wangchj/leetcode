/**
 * Author:  Chih-Jye Wang
 * Date:    Dec 11, 2013
 *
 * You are given two linked lists representing two non-negative numbers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 *
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 */
public class AddTwoNumbers
{
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2)
    {
        return longToNode(nodeToLong(l1) + nodeToLong(l2));
    }
    
    public static long nodeToLong(ListNode node)
    {
        if(node == null)
            return 0;
            
        long sum = 0;
        int i = 0;
        
        for(ListNode n = node; n != null; n = n.next)
        {
            sum += n.val * Math.pow(10, i);
            i++;
        }
        return sum;
    }
    
    public static ListNode longToNode(long v)
    {
        String s = v + "";
        ListNode r = new ListNode(s.charAt(s.length() - 1) - 48);
        ListNode p = r;
        for(int i = s.length() - 2; i >= 0; i--)
        {
            ListNode n = new ListNode(s.charAt(i) - 48);
            p.next = n;
            p = n;
        }
        return r;
    }
}