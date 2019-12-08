# @param {Integer[]} nums
# @return {Integer}
def single_number(nums)
    res = 0
    nums.each {|num| res ^= num}
    return res
end
