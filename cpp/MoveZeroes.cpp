#include <iostream>
#include <vector>

using namespace std;

class MoveZeroes {
public:
    void moveZeroes(vector<int>& nums) {
        int z = nums.size() - 1;
        while(z > 0 && nums[z] == 0)
            z--;
        for(int i = z - 1; i >= 0; i--) {
            if(nums[i] == 0) {
                for(int j = i; j < z; j++) {
                    nums[j] ^= nums[j + 1];
                    nums[j + 1] ^= nums[j];
                    nums[j] ^= nums[j + 1];
                }
                z--;
            }
        }
    }
};

int main() {
    MoveZeroes s;
    vector<int> nums;
    nums.push_back(0);
    nums.push_back(1);
    nums.push_back(0);
    nums.push_back(3);
    nums.push_back(12);
    s.moveZeroes(nums);
    for(int i = 0; i < nums.size(); i++)
        cout << nums[i] << ' ';
}