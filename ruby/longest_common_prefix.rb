# @param {String[]} strs
# @return {String}
def longest_common_prefix(strs)
    return '' if !strs|| strs.length == 0

    indexes = Array.new(strs.length, 0)
    res = ''
    while has_more_chars(strs, indexes)
        if has_same_chars(strs, indexes)
            res += strs[0][indexes[0]]
        else
            return res
        end
        increment_indexes(indexes)
    end
    return res
end

def has_more_chars(strs, indexes)
    for i in 0..strs.length - 1
        return false if indexes[i] >= strs[i].length
    end
    return true
end

def has_same_chars(strs, indexes)
    for i in 0..strs.length - 1
        next if i == 0
        return false if strs[i][indexes[i]] != strs[i - 1][indexes[i - 1]]
    end
    return true
end

def increment_indexes(indexes)
    for i in 0..indexes.length - 1
        indexes[i] += 1
    end
end

p longest_common_prefix(["aca","cba"])