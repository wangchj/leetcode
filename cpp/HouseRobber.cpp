/**
 * Author: Chih-Jye Wang
 * Date  : Oct 14, 2015
 *
 * You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security system connected and it will automatically contact the police if two adjacent houses were broken into on the same night.
 *
 * Given a list of non-negative integers representing the amount of money of each house, determine the maximum amount of money you can rob tonight without alerting the police.
 */
 
#include <vector>
#include <algorithm>

using namespace std;

class HouseRobber {
public:
    int rob(vector<int>& nums) {
        if(nums.size() == 0)
            return 0;
        if(nums.size() == 1)
            return nums[0];

        int m[nums.size()];
        m[0] = nums[0];
        m[1] = max(nums[1], m[0]);

        for(int i = 2; i < nums.size(); i++)
            m[i] = max(m[i - 1], nums[i] + m[i - 2]);

        return m[nums.size() - 1];
    }
};