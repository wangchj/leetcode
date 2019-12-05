/**
 * Author: Chih-Jye Wang
 * Date  : Feb 9, 2015
 *
 * Implement an iterator over a binary search tree (BST). Your iterator will be initialized with the root node of a BST.
 *
 * Calling next() will return the next smallest number in the BST.
 *
 * Note: next() and hasNext() should run in average O(1) time and uses O(h) memory, where h is the height of the tree.
 * 
 * Your BSTIterator will be called like this:
 * BSTIterator i = new BSTIterator(root);
 * while (i.hasNext()) v[f()] = i.next();
 */

import java.util.*;

public class BSTIterator
{
    Stack<TreeNode> stack;

    public BSTIterator(TreeNode root)
    {
        stack = new Stack<TreeNode>();
        populateStack(root);
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext()
    {
        return !stack.isEmpty();
    }

    /** @return the next smallest number */
    public int next()
    {
        TreeNode node = stack.pop();
        if(node.right != null)
            populateStack(node.right);
        return node.val;
    }

    private void populateStack(TreeNode root)
    {
        if(root == null)
            return;
        while(root != null)
        {
            stack.push(root);
            root = root.left;
        }
    }
}
