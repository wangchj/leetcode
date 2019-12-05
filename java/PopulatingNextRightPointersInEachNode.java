/**
 * Author:  Chih-Jye Wang
 * Date:    Nov 20, 2013
 * 
 * Populating Next Right Pointers in Each Node:
 * Given a binary tree
 *
 *     struct TreeLinkNode {
 *        TreeLinkNode *left;
 *        TreeLinkNode *right;
 *        TreeLinkNode *next;
 *     }
 * 
 * Populate each next pointer to point to its next right node. If there is no next right node, the next pointer should be set to NULL.
 *
 * Initially, all next pointers are set to NULL.
 *
 * Note:
 *
 * - You may only use constant extra space.
 * - You may assume that it is a perfect binary tree (ie, all leaves are at the same level, and every parent has two children).
 *
 * For example,
 * Given the following perfect binary tree,
 *          1
 *        /  \
 *       2    3
 *      / \  / \
 *     4  5  6  7
 *
 * After calling your function, the tree should look like:
 *
 *          1 -> NULL
 *        /  \
 *       2 -> 3 -> NULL
 *      / \  / \
 *     4->5->6->7 -> NULL
 */
public class PopulatingNextRightPointersInEachNode
{
   public void connect(TreeLinkNode root) {
      // IMPORTANT: Please reset any member data you declared, as
      // the same Solution instance will be reused for each test case.
      if(root == null || root.left == null || root.right == null)
         return;
      bridge(root);
      connect(root.left);
      connect(root.right);
   }
   
   private static void bridge(TreeLinkNode node)
   {
      TreeLinkNode left = node.left, right = node.right;
      
      while(left != null && right != null)
      {
         left.next = right;
         left = left.right;
         right = right.left;
      }
   }   
}

class TreeLinkNode {
   int val;
   TreeLinkNode left, right, next;
   TreeLinkNode(int x) { val = x; }
}