# @param {Integer[]} prices
# @return {Integer}
def max_profit(prices)
    return 0 if !prices || prices.length == 0
    min_price = prices[0]
    res = 0
    for i in 0...prices.length
        min_price = prices[i] if prices[i] < min_price
        res = [res, prices[i] - min_price].max
    end
    return res
end
