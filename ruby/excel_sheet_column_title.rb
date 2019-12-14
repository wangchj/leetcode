# @param {Integer} n
# @return {String}
def convert_to_title(n)
    res = ""

    while n > 0
        n -= 1
        res << ((n % 26) + 'A'.ord).chr
        n /= 26
    end

    return res.reverse
end
