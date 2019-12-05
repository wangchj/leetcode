# @param {Integer[]} nums
# @param {Integer} target
# @return {Integer}
def search_insert(nums, target)
    return 0 if !nums || nums.length == 0

    i = 0
    j = nums.length - 1
    while i < j
        mid = (j - i) / 2 + i
        val = nums[mid]
        if val == target
            return mid
        elsif val > target
            j = mid - 1
        elsif val < target
            i = mid + 1
        end
    end

    return nums[i] >= target ? i : i + 1
end

#.      0  1. 2  3
nums = [1, 3, 5, 6]
target = 7

nums = [1,3]
target = 2

p search_insert(nums, target)