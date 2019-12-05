/**
 * Author: Chih-Jye Wang
 * Date  : Oct 19, 2015
 *
 * Given a triangle, find the minimum path sum from top to bottom. Each step you may move to adjacent numbers on the row below.
 *
 * For example, given the following triangle
 * [
 *      [2],
 *     [3,4],
 *    [6,5,7],
 *   [4,1,8,3]
 * ]
 * The minimum path sum from top to bottom is 11 (i.e., 2 + 3 + 5 + 1 = 11).
 *
 * Note:
 * Bonus point if you are able to do this using only O(n) extra space, where n is the total number of rows in the triangle.
 */

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Triangle
{
    public int minimumTotal(List<List<Integer>> triangle)
    {
        for(int i = triangle.size() - 2; i >= 0; i--) {
            int c = triangle.get(i).size();
            for(int j = 0; j < c; j++) {
                int a = triangle.get(i).get(j) + triangle.get(i + 1).get(j);
                int b = triangle.get(i).get(j) + triangle.get(i + 1).get(j + 1);
                triangle.get(i).set(j, Math.min(a, b));
            }
        }
        return triangle.get(0).get(0);
    }

    public static void main(String[] args) {
        Integer[][] a = {
            {2},
            {3, 4},
            {6, 5, 6},
            {4, 1, 8, 3}
        };
        
        List<List<Integer>> t = new ArrayList<>();
        for(int i = 0; i < a.length; i++)
            t.add(Arrays.asList(a[i]));

        Triangle s = new Triangle();
        System.out.println(s.minimumTotal(t));
    }
}