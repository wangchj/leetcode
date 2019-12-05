MAP = {
    'I' => 1,
    'V' => 5,
    'X' => 10,
    'L' => 50,
    'C' => 100,
    'D' => 500,
    'M' => 1000
}

# @param {String} s
# @return {Integer}
def roman_to_int(s)
    res = 0
    i = 0
    while i < s.length
        if i == s.length - 1
            res += MAP[s[i]]
            i += 1
        else
            x = MAP[s[i]]
            y = MAP[s[i + 1]]
            res += x < y ? y - x : x
            i += x < y ? 2 : 1
        end
    end
    res
end

p roman_to_int('I')
p roman_to_int('IV')
p roman_to_int('X')
