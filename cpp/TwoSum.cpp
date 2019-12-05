/**
 * Author: Chih-Jye Wang
 * Date  : Oct 16, 2015
 *
 * Given an array of integers, find two numbers such that they add up to a specific target number.
 *
 * The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.
 *
 * You may assume that each input would have exactly one solution.
 *
 * Input: numbers={2, 7, 11, 15}, target=9
 * Output: index1=1, index2=2
 */
 
#include <vector>
#include <unordered_map>

using namespace std;

class TwoSum {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        unordered_map<int, int> m;
        for(int i = 0; i < nums.size(); i++) {
            if(m.find(target - nums[i]) == m.end()) {
                m[nums[i]] = i;
            }
            else {
                vector<int> v;
                v.push_back(m[target - nums[i]] + 1);
                v.push_back(i + 1);
                return v;
            }
        }
    }
};