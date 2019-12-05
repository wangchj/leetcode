import java.util.Queue;
import java.util.LinkedList;

public class TreeNode
{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x)
    {
        val = x;
    }
    
    public static TreeNode deserialize(String s)
    {
        //Remove brackets
        s = s.substring(1, s.length() - 1);
        //Split string into tokens
        String[] val = s.split(",");
        
        //Check to see if there are actually nodes
        if(val.length == 0)
            return null;
        
        Queue<TreeNode> q = new LinkedList<TreeNode>();    
        TreeNode head = new TreeNode(Integer.valueOf(val[0]));
        q.add(head);
        
        int i = 1;
        while(i < val.length)
        {
            TreeNode node = q.poll();
            if(!val[i].contains("#"))
            {
                node.left = new TreeNode(Integer.valueOf(val[i]));
                q.add(node.left);
            }
            if(i+1 < val.length && !val[i + 1].contains("#"))
            {
                node.right = new TreeNode(Integer.valueOf(val[i + 1]));
                q.add(node.right);
            }
            i += 2;
        }
        
        return head;
    }   
}        