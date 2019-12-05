# @param {String} a
# @param {String} b
# @return {String}
def add_binary(a, b)
    r = ''
    c = 0
    i = a.length - 1
    j = b.length - 1
    while i >= 0 || j >= 0
        x = i >= 0 ? a[i].to_i : 0
        y = j >= 0 ? b[j].to_i : 0
        s = x + y + c
        r << (s % 2).to_s
        c =  s / 2
        i -= 1 if i >= 0
        j -= 1 if j >= 0
    end

    r << '1' if c != 0
    r.reverse
end

p add_binary('1', '1')