require 'set'

# @param {Integer} n
# @return {Boolean}
def is_happy(n)
    return true if n == 1
    set = Set.new
    set.add(n)
    while true
        n = sum_digits(n)
        return true if n == 1
        return false if set.include?(n)
        set.add(n)
    end
end

def sum_digits(n)
    sum = 0
    while n > 0
        digit = n % 10
        sum += digit * digit
        n /= 10
    end
    return sum
end
