# @param {Integer[]} nums
# @return {Integer}
def max_sub_array(nums)
    return 0 if !nums || nums.length == 0
    sum = 0
    max = nil
    for i in 0...nums.length
        if i == 0
            sum = nums[i]
        else
            sum = [nums[i], nums[i] + sum].max
        end
        max = sum if max == nil || sum > max
    end
    return max
end

nums = [-2,1,-3,4,-1,2,1,-5,4]
p max_sub_array(nums)