# @param {String} s
# @param {String} t
# @return {Character}
def find_the_difference(s, t)
    r = 0
    s.each_codepoint {|code| r ^= code}
    t.each_codepoint {|code| r ^= code}
    return r.chr
end
