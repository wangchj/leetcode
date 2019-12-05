# @param {String} s
# @return {Boolean}
def is_valid(s)
    return true if !s || s.length == 0
    stack = []
    for i in 0..s.length - 1
        c = s[i]
        if c == '(' || c == '{'|| c == '['
            stack.push(c)
        else
            top = stack.pop
            return false if !pair_match(top, c)
        end
    end
    return stack.empty?
end

def pair_match(a, b)
    return true if a == '(' && b == ')'
    return true if a == '{' && b == '}'
    return true if a == '[' && b == ']'
    return false
end

p is_valid('[]()')