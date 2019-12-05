# @param {Integer[]} digits
# @return {Integer[]}
def plus_one(digits)
    carry = 1
    i = digits.length - 1
    while i >= 0
        sum = digits[i] + carry
        digits[i] = sum % 10
        carry = sum / 10
        i -= 1
    end
    digits.unshift(1) if carry != 0
    return digits
end

digits = [1,2,3]
p plus_one(digits)