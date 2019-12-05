MAX_INTEGER = 2147483647

# @param {Integer} x
# @return {Integer}
def reverse(x)
    is_neg = x < 0
    x = 0 - x if is_neg
    a = 0
    while x > 0
        a = (a * 10) + (x % 10)
        return 0 if a > MAX_INTEGER
        x /= 10
    end
    is_neg ? a * -1 : a
end

p reverse(1)