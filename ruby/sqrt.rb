# @param {Integer} x
# @return {Integer}
def my_sqrt(x)
    i = 1
    j = x
    while i < j
        mid = (j - i) / 2 + i
        sq  = mid * mid
        if sq == x
            return mid
        elsif sq < x
            i = mid + 1
        else
            j = mid - 1
        end
    end
    return (i * i) > x ? i - 1 : i
end

p my_sqrt(8)