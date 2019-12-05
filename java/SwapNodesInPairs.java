/**
 * Author: Chih-Jye Wang
 * Date  : Jan 23, 2014
 *
 * Given a linked list, swap every two adjacent nodes and return its head.
 *
 * For example,
 * Given 1->2->3->4, you should return the list as 2->1->4->3.
 *
 * Your algorithm should use only constant space. You may not modify the values in the list, only nodes itself can be changed.
 */
public class SwapNodesInPairs
{
    public static ListNode swapPairs(ListNode head)
    {
        if(head == null)
            return null;
        if(head.next == null)
            return head;
        
        //The drag behind: the node before first node
        ListNode zero = null;   
        //One of two nodes
        ListNode one = head;
        //Two of two nodes
        ListNode two = head.next;
        //Returned
        ListNode res = two;
        
        while(one != null && two != null)
        {
            one.next = two.next;
            two.next = one;
            
            if(zero != null)
                zero.next = two;
            
            zero = one;
                
            one = one.next;
            if(one == null)
                break;
            two = one.next;    
        }
        
        return res;            
    }
    
    public static void main(String[] args)
    {
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode tre = new ListNode(3);
        ListNode qua = new ListNode(4);
        
        one.next = two; two.next = tre; tre.next = qua;
        
        ListNode r = swapPairs(one);
    }
}