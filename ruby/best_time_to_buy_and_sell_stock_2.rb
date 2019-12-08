# @param {Integer[]} prices
# @return {Integer}
def max_profit(prices)
    return 0 if !prices || prices.length == 0
    i = j = res = 0
    while j < prices.length
        if j > 0 && prices[j] < prices[j - 1]
            res += prices[j - 1] - prices[i]
            i = j
        end
        j += 1
    end
    res += prices[j - 1] - prices[i]
    return res
end
