/**
 * Author: Chih-Jye Wang
 * Date  : Jan 18, 2013
 *
 * Given two integers n and k, return all possible combinations of k numbers out of 1 ... n.
 *
 * For example,
 * If n = 4 and k = 2, a solution is:
 *
 * [
 *   [2,4],
 *   [3,4],
 *   [2,3],
 *   [1,2],
 *   [1,3],
 *   [1,4],
 * ]
 *
 * Solution: use the solution from Subsets and choose subsets that are length k.
 */
 
import java.util.ArrayList;

public class Combinations
{
    public static ArrayList<ArrayList<Integer>> combine(int n, int k)
    {
        int[] s = new int[n];
        for(int i = 0; i < s.length; i++)
            s[i] = i + 1;
        ArrayList<ArrayList<Integer>> subsets = Subsets.subsets(s);
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        for(ArrayList<Integer> subset : subsets)
            if(subset.size() == k)
                result.add(subset);
        return result;
    }
}