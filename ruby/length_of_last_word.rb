# @param {String} s
# @return {Integer}
def length_of_last_word(s)
    return 0 if !s || s.length == 0

    i = s.length - 1
    j = nil
    while i >= 0
        a = s[i]
        if a == ' '
            break if j
        else
            j = i if !j
        end
        i -= 1
    end
    return j ? j - i : 0
end

p length_of_last_word("    ")