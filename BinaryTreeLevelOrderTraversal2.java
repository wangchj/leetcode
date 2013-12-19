/**
 * Author: Chih-Jye Wang
 * Date  : Dec 18, 2013
 *
 * Binary Tree Level Order Traversal II Total Accepted: 3231 Total Submissions: 10479 My Submissions
 *
 * Given a binary tree, return the bottom-up level order traversal of its nodes' values. (ie, from left to right, level by level from leaf to root).
 *
 * For example:
 * Given binary tree {3,9,20,#,#,15,7},
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * return its bottom-up level order traversal as:
 * [
 *   [15,7]
 *   [9,20],
 *   [3],
 * ]
 */
import java.util.ArrayList;
import java.util.Collections;

public class BinaryTreeLevelOrderTraversal2
{
    public ArrayList<ArrayList<Integer>> levelOrderBottom(TreeNode root)
    {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        levelOrder(root, 0, result);
        Collections.reverse(result);
        return result;
    }
    
    void levelOrder(TreeNode root, int level, ArrayList<ArrayList<Integer>> result)
    {
        if(root == null)
            return;
        if(result.size() <= level)
            result.add(new ArrayList<Integer>());
        ArrayList<Integer> levelList = result.get(level);
        levelList.add(root.val);
        levelOrder(root.left, level + 1, result);
        levelOrder(root.right, level + 1, result);
    }
}