/**
 * Author: Chih-Jye Wang
 * Date  : Feb 12, 2015
 *
 * Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.
 *
 * You may assume that the array is non-empty and the majority element always exist in the array.
 */

import java.util.HashMap;

public class MajorityElement {
    public int majorityElement(int[] num) {
        HashMap<Integer, Integer> count = new HashMap<Integer, Integer>();
        int limit = num.length / 2;
        for(int i : num) {
            if(!count.containsKey(i)){
                count.put(i, 1);
                if( 1 > limit)
                    return i;
            }
            else {
                count.put(i, count.get(i) + 1);
                if(count.get(i) > limit)
                    return i;
            }
        }
        return 0;
    }
}