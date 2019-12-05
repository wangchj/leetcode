# @param {String} haystack
# @param {String} needle
# @return {Integer}
def str_str(haystack, needle)
    for i in (0..haystack.length - needle.length)
        return i if is_target(haystack, i, needle)
    end
    return -1
end

def is_target(haystack, i, needle)
    for j in 0...needle.length
        return false if haystack[i + j] != needle[j]
    end
    return true
end

p str_str("aaaaa", "bba")