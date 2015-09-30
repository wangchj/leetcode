/**
 * Author: Chih-Jye Wang
 * Date  : Sep 29, 2015
 *
 * Given a collection of integers that might contain duplicates, nums, return all possible subsets.
 *
 * Note:
 * Elements in a subset must be in non-descending order.
 * The solution set must not contain duplicate subsets.
 * For example,
 * If nums = [1,2,2], a solution is:
 *
 * [
 *   [2],
 *   [1],
 *   [1,2,2],
 *   [2,2],
 *   [1,2],
 *   []
 * ]
 */

import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Arrays;

public class Subsets2 {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        int count = 1;
        ArrayList<List<Integer>> res = new ArrayList<>();
        HashSet<ArrayList<Integer>> set = new HashSet<>();
        Arrays.sort(nums);
        int stop = (int)Math.pow(2, nums.length) - 1;
        for(int i = 0; i <= stop; i++) {
            ArrayList<Integer> list = new ArrayList<>();
            int m = 1;
            for(int j = 0; j < nums.length; j++) {
                if((i & m) != 0)
                    list.add(nums[j]);
                m <<= 1;
            }
            if(!set.contains(list)){
                set.add(list);
                res.add(list);
            }
        }
        return res;
    }
}