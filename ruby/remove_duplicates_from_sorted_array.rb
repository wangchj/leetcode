# @param {Integer[]} nums
# @return {Integer}
def remove_duplicates(nums)
    i = last = 0

    while i < nums.length
        if i == 0 || nums[i] != nums[i - 1]
            nums[last] = nums[i]
            last += 1
        end

        i += 1
    end

    return last
end

nums = [1]
p remove_duplicates(nums)
p nums