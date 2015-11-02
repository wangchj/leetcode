/**
 * Given a binary tree, return all root-to-leaf paths.
 *
 * For example, given the following binary tree:
 *
 *    1
 *  /   \
 * 2     3
 *  \
 *   5
 * All root-to-leaf paths are:
 *
 * ["1->2->5", "1->3"]
 *
 * @author Chih-Jye Wang
 * @since  2015-11-02
 */

import java.util.List;
import java.util.LinkedList;

public class BinaryTreePaths {
    public List<String> BinaryTreePaths(TreeNode root) {
        LinkedList<String> res = new LinkedList<>();
        LinkedList<Integer> path = new LinkedList<>();
        paths(root, path, res);
        return res;
    }

    public void paths(TreeNode node, LinkedList<Integer> path, LinkedList<String> res) {
        if(node == null)
            return;

        if(node.left == null && node.right == null) {
            StringBuilder s = new StringBuilder();
            for(int i : path)
                s.append(i).append("->");
            s.append(node.val);
            res.add(s.toString());
            return;
        }

        path.add(node.val);

        if(node.left != null) {
            paths(node.left, path, res);
        }

        if(node.right != null) {
            paths(node.right, path, res);
        }

        path.removeLast();
    }

    public static void main(String[] args) {

    }
}