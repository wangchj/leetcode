# @param {Integer[]} nums1
# @param {Integer} m
# @param {Integer[]} nums2
# @param {Integer} n
# @return {Void} Do not return anything, modify nums1 in-place instead.
def merge(nums1, m, nums2, n)
    i = nums1.length - 1
    a = m - 1
    b = n - 1
    while b >= 0
        nums1[i] = a < 0 ? nums2[b] : [nums1[a], nums2[b]].max
        if a >= 0 && nums1[a] > nums2[b]
            a -= 1
        else
            b -= 1
        end
        i -= 1
    end
end
