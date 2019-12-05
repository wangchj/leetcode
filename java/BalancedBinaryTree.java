/**
 * Author: Chih-Jye Wang
 * Date  : Jan 15, 2014
 *
 * Given a binary tree, determine if it is height-balanced.
 *
 * For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.
 */

public class BalancedBinaryTree
{
    public boolean isBalanced(TreeNode root)
    {
        return balanced(root) != -1;
    }
    
    /**
     * Return height if node is balanced. -1 otherwise.
     */
    public int balanced(TreeNode node)
    {
        if(node == null)
            return 0;
        if(node.left == null && node.right == null)
            return 1;
        int left  = balanced(node.left);
        int right = balanced(node.right);
        if(left == -1 || right == -1)
            return -1;
        return Math.abs(left - right) <= 1 ? Math.max(left, right) + 1 : -1;        
    }
}