# @param {Integer} n
# @return {Integer}
def climb_stairs(n)
    return 0 if n == 0
    a = Array.new(n)
    i = 0
    while i < n
        a[i] = 1 if i == 0
        a[i] = 2 if i == 1
        a[i] = a[i - 2] + a[i - 1] if i >= 2
        i += 1
    end
    return a[n - 1]
end
