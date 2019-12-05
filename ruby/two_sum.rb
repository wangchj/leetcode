# @param {Integer[]} nums
# @param {Integer} target
# @return {Integer[]}
def two_sum(nums, target)
    map = {};
    for i in (0..nums.size - 1) do
        element = nums[i]
        complement = target - element
        if map[complement]
            return [map[complement], i]
        end
        map[element] = i
    end
end

p two_sum([1, 2, 3, 4, 5], 3)