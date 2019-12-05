@cache = {}

# @param {String} s
# @return {String}
def longest_palindrome(s)
    return longest(s, 0, s.length - 1)
end

def longest(s, i, j)
    return s[i..j] if is_palindrome(s, i, j)
    a = longest(s, i + 1, j)
    b = longest(s, i, j - 1)
    return a.length > b.length ? a : b
end

def is_palindrome(s, i, j)
    # puts "is_palindrome: #{s[i..j]}"
    str = s[i..j]
    return @cache[str] if @cache.key?(str)
    while i < j
        if s[i] != s[j]
            @cache[str] = false
            return false
        end
        i += 1
        j -= 1
    end
    @cache[str] = true
    return true
end

p longest_palindrome("babaddtattarrattatddetartrateedredividerb")
# p longest_palindrome("babad")