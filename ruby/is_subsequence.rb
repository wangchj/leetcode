# @param {String} s
# @param {String} t
# @return {Boolean}
def is_subsequence(s, t)
    return true if s.length == 0
    i = j = 0
    while i < t.length
        j += 1 if t[i] == s[j]
        return true if j == s.length
        i += 1
    end
    return false
end
