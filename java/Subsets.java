/**
 * Author: Chih-Jye Wang
 * Date  : Jan 17, 2013
 *
 * Given a set of distinct integers, S, return all possible subsets.
 *
 * Note:
 * Elements in a subset must be in non-descending order.
 * The solution set must not contain duplicate subsets.
 * For example,
 * If S = [1,2,3], a solution is:
 *
 * [
 *   [3],
 *   [1],
 *   [2],
 *   [1,2,3],
 *   [1,3],
 *   [2,3],
 *   [1,2],
 *   []
 * ]
 */
 
import java.util.*;

public class Subsets
{
    public static ArrayList<ArrayList<Integer>> subsets(int[] S)
    {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        //Keep track which position in S should be added to a set
        BitString onePos = new BitString();
        //Bounds the number of iterations
        int bound = (int)Math.pow(2, S.length);
        
        Arrays.sort(S);
        
        for(int i = 0; i < bound; i++)
        {
            //Result for this set
            ArrayList<Integer> set = new ArrayList<Integer>();
            //Get all elements for this set
            for(Integer p : onePos.set)
                set.add(S[p]);
            //Add the current set to the result
            result.add(set);
            //Add 1 to bit string
            onePos.inc();    
        }
        return result;
    }
}

/**
 * A ordered string of boolean values.
 */
class BitString
{
    public TreeSet<Integer> set;
    public BitString()
    {
        set = new TreeSet<Integer>();
    }
    
    public void inc()
    {
        int i = 0;
        while(true)
        {
            if(!set.contains(i))
            {
                set.add(i);
                return;
            }
            else
            {
                set.remove(i);
                i++;
            }
        }
    }
}