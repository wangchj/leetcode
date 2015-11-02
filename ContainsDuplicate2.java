/**
 * Given an array of integers and an integer k, find out whether there are two distinct indices i and j in the array such that nums[i] = nums[j] and the difference between i and j is at most k.
 *
 * @author Chih-Jye Wang
 * @since  2015-11-02
 */
 
import java.util.HashMap;

public class ContainsDuplicate2 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> m = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if(m.containsKey(nums[i])) {
                if(i - m.get(nums[i]) <= k)
                return true;
            }
            m.put(nums[i], i);
        }
        return false;
    }
}
