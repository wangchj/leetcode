# @param {Integer} n
# @return {String}
def count_and_say(n)
    res = "1"
    i = 1
    while i < n
        res = count(res)
        i += 1
    end
    return res
end

def count(str)
    res = ""
    i = 0
    j = 1

    while j < str.length
        if str[i] != str[j]
            res << "#{j - i}#{str[i]}"
            i = j
        end

        j += 1
    end

    res << "#{j - i}#{str[i]}"
end

p count_and_say(6)