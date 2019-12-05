/**
 * Author: Chih-Jye Wang
 * Date  : Feb 8, 2015
 *
 * Given a binary tree containing digits from 0-9 only, each root-to-leaf path could represent a number.
 *
 * An example is the root-to-leaf path 1->2->3 which represents the number 123.
 *
 * Find the total sum of all root-to-leaf numbers.
 *
 * For example,
 *
 *     1
 *    / \
 *   2   3
 * The root-to-leaf path 1->2 represents the number 12.
 * The root-to-leaf path 1->3 represents the number 13.
 *
 * Return the sum = 12 + 13 = 25.
 */
 
import java.util.*;

public class SumRootToLeafNumbers
{
    public int sumNumbers(TreeNode root)
    {
        return sum(root, 0, new LinkedList<Integer>());
    }
    
    /**
     * Recursive version of sum.
     */
    private int sum(TreeNode root, int sum, LinkedList<Integer> path)
    {
        if(root == null)
            return sum;
        if(root.left == null && root.right == null)
        {
            sum += root.val;
            Iterator<Integer> iter = path.descendingIterator();
            int i = 1;
            while(iter.hasNext())
            {
                sum += Math.pow(10, i) * (iter.next());
                i++;
            }
            return sum;
        }
        
        path.add(root.val);
        int leftSum = sum(root.left, sum, path);
        int rightSum = sum(root.right, leftSum, path);
        path.removeLast();
        
        return rightSum;
    }
}