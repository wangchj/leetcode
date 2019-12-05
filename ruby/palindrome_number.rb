# @param {Integer} x
# @return {Boolean}
def is_palindrome(x)
    return false if x < 0

    s = x.to_s
    left = 0
    right = s.length - 1

    while left < right
        return false if s[left] != s[right]
        left += 1
        right -= 1
    end

    return true
end

p is_palindrome(121)