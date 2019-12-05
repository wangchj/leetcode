require 'set'

# @param {String} s
# @return {Integer}
def length_of_longest_substring(s)
    set = Set.new()
    max = 0
    for i in 0...s.length
        set.clear
        for j in i...s.length
            if set.include? s[j]
                break
            else
                set.add(s[j])
            end
        end
        max = set.length if set.length > max
    end
    return max
end

p length_of_longest_substring("abcabcbb")