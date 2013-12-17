/**
 * Author: Chih-Jye Wang
 * Date  : Dec 17, 2013
 *
 * Given numRows, generate the first numRows of Pascal's triangle.
 *
 * For example, given numRows = 5,
 * Return
 *
 * [
 *      [1],
 *     [1,1],
 *    [1,2,1],
 *   [1,3,3,1],
 *  [1,4,6,4,1]
 * ]
 */
import java.util.ArrayList;

public class PascalsTriangle
{
    public ArrayList<ArrayList<Integer>> generate(int numRows)
    {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>(numRows);
        for(int n = 0; n < numRows; n++)
        {
            ArrayList<Integer> row = new ArrayList<Integer>(n + 1);
            for(int k = 0; k < n + 1; k++)
            {
                if(k == 0 || k == n)
                    row.add(1);
                else
                    row.add(result.get(n - 1).get(k - 1) + result.get(n - 1).get(k));
            }
            result.add(row);
        }
        return result;
    }
}