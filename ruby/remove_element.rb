# @param {Integer[]} nums
# @param {Integer} val
# @return {Integer}
def remove_element(nums, val)
    i = count = 0;
    while i < nums.length
        if nums[i] == val
            count += 1
        else
            nums[i - count] = nums[i]
        end
        i += 1
    end
    return nums.length - count
end

nums = [0,1,2,2,3,0,4,2]
val = 2
p remove_element(nums, val)
p nums