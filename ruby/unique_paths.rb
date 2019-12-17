# @param {Integer} m
# @param {Integer} n
# @return {Integer}
def unique_paths(m, n)
    a = Array.new(m) {Array.new(n)}
    for i in 0...m
        for j in 0...n
            if (i == 0 || j == 0)
                a[i][j] = 1
            else
                a[i][j] = a[i - 1][j] + a[i][j - 1]
            end
        end
    end
    return a[m - 1][n - 1]
end
