/**
 * Author: Chih-Jye Wang
 * Date  : Oct 14, 2015
 *
 * You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security system connected and it will automatically contact the police if two adjacent houses were broken into on the same night.
 *
 * Given a list of non-negative integers representing the amount of money of each house, determine the maximum amount of money you can rob tonight without alerting the police.
 */

public class HouseRobber {
    public int rob(int[] nums) {
        if(nums == null || nums.length == 0)
            return 0;
        if(nums.length == 1)
            return nums[0];

        int[] m = new int[nums.length];
        m[0] = nums[0];
        m[1] = Math.max(nums[1], m[0]);

        for(int i = 2; i < nums.length; i++) {
            m[i] = Math.max(m[i - 1], nums[i] + m[i - 2]);
        }

        return m[m.length - 1];
    }

    public static void main(String[] args) {
        HouseRobber s = new HouseRobber();
        System.out.println(s.rob(new int[] {2, 1, 1, 2}));
    }
}