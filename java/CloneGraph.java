/**
 * Author: Chih-Jye Wang
 * Date  : Jan 19, 2014
 * Clone an undirected graph. Each node in the graph contains a label and a list of its neighbors.
 *
 *
 * OJ's undirected graph serialization:
 * Nodes are labeled uniquely.
 *
 * We use # as a separator for each node, and , as a separator for node label and each neighbor of the node.
 * As an example, consider the serialized graph {0,1,2#1,2#2,2}.
 *
 * The graph has a total of three nodes, and therefore contains three parts as separated by #.
 *
 * First node is labeled as 0. Connect node 0 to both nodes 1 and 2.
 * Second node is labeled as 1. Connect node 1 to node 2.
 * Third node is labeled as 2. Connect node 2 to node 2 (itself), thus forming a self-cycle.
 * Visually, the graph looks like the following:
 *
 *        1
 *       / \
 *      /   \
 *     0 --- 2
 *          / \
 *          \_/
 */
 
import java.util.*;

public class CloneGraph
{
    public static UndirectedGraphNode cloneGraph(UndirectedGraphNode node)
    {
        if(node == null)
            return null;
            
        //A list of nodes already cloned
        HashMap<Integer, UndirectedGraphNode> map = new HashMap<Integer, UndirectedGraphNode>();
        //A list of nodes to be cloned (neighbor to be constructed)
        Queue<UndirectedGraphNode> q = new LinkedList<UndirectedGraphNode>();
        
        //Add the first node
        q.add(node);
        
        while(!q.isEmpty())
        {
            //Get a node from queue to clone and construct neighbor
            UndirectedGraphNode origin = q.remove();
            UndirectedGraphNode clone;
            
            if(map.containsKey(origin.label))
                clone = map.get(origin.label);
            else
            {
                clone = new UndirectedGraphNode(origin.label);
                map.put(origin.label, clone);
            }
            
            for(UndirectedGraphNode neighbor : origin.neighbors)
            {
                if(map.containsKey(neighbor.label))
                {
                    clone.neighbors.add(map.get(neighbor.label));
                }
                else
                {
                    UndirectedGraphNode n = new UndirectedGraphNode(neighbor.label);
                    clone.neighbors.add(n);
                    map.put(neighbor.label, n);
                    q.add(neighbor);
                }
            }
            
        }
        return map.get(node.label);
    }
    
    public static void main(String[] args)
    {
        UndirectedGraphNode two = new UndirectedGraphNode(2);
        two.neighbors.add(two);
        
        UndirectedGraphNode one = new UndirectedGraphNode(1);
        one.neighbors.add(two);
        
        UndirectedGraphNode zero = new UndirectedGraphNode(0);
        zero.neighbors.add(one);
        
        UndirectedGraphNode r = CloneGraph.cloneGraph(zero);
    }
}