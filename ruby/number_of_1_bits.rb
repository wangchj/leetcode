# @param {Integer} n, a positive integer
# @return {Integer}
def hamming_weight(n)
    res = 0
    while n > 0
        res += 1 if n & 1 != 0
        n >>= 1
    end
    return res
end
