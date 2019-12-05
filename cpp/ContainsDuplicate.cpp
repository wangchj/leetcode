/**
 * Author: Chih-Jye Wang
 * Date  : Oct 13, 2015
 *
 * Given an array of integers, find if the array contains any duplicates. Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.
 */
 
#include <vector>
#include <algorithm>
#include <iostream>

using namespace std;

class ContainsDuplicate {
public:
    bool containsDuplicate(vector<int>& nums) {
        if(nums.size() == 0)
            return false;
        sort(nums.begin(), nums.end());
        for(int i = 1; i < nums.size(); i++)
            if(nums[i] == nums[i - 1])
                return true;
        return false;
    }
};

int main() {
    int i[] = {3, 1, 4, 3, 5, 0};
    vector<int> nums(i, i + 6);
    ContainsDuplicate s;
    cout << s.containsDuplicate(nums) << endl;
    for(int i = 0; i < nums.size(); i++) {
        cout << nums[i] << ' ';
    }
}