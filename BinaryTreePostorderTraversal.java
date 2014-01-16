/**
 * Author: Chih-Jye Wang
 * Date  : Dec 21, 2013
 *
 * Given a binary tree, return the postorder traversal of its nodes' values.
 *
 * For example:
 * Given binary tree {1,#,2,3},
 *    1
 *     \
 *      2
 *     /
 *    3
 * return [3,2,1].
 *
 * Note: Recursive solution is trivial, could you do it iteratively?
 * 
 * Solution: iterative algorithm using a stack.
 */
import java.util.ArrayList;
import java.util.Stack;

public class BinaryTreePostorderTraversal
{
    public ArrayList<Integer> postorderTraversal(TreeNode root)
    {
        ArrayList<Integer> result = new ArrayList<Integer>();
        if(root == null) return result;
        Stack<State> stack = new Stack<State>();
        stack.push(new State(root, 0));
        while(!stack.empty())
        {
            State s = stack.peek();
            if(s.state == 0)
            {
                s.state = 1;
                if(s.node.left != null)
                    stack.push(new State(s.node.left, 0));
            }
            else if(s.state == 1)
            {
                s.state = 2;
                if(s.node.right != null)
                    stack.push(new State(s.node.right, 0));
            }
            else
            {
                result.add(s.node.val);
                stack.pop();
            }
        }
        return result;
    }
    
    class State
    {
        TreeNode node;
        int state;
        
        State(TreeNode node, int state)
        {
            this.node = node;
            this.state = state;
        }
    }
}