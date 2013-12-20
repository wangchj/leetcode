/**
 * Author: Chih-Jye Wang
 * Date  : Dec 18, 2013
 *
 * Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).
 *
 * For example:
 * Given binary tree {3,9,20,#,#,15,7},
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * return its level order traversal as:
 * [
 *   [3],
 *   [9,20],
 *   [15,7]
 * ]
 */
import java.util.ArrayList;

public class BinaryTreeLevelOrderTraversal
{
    public ArrayList<ArrayList<Integer>> levelOrder(TreeNode root)
    {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        levelOrder(root, 0, result);
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