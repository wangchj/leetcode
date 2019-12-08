# @param {Integer} num_rows
# @return {Integer[][]}
def generate(num_rows)
    return [] if num_rows == 0
    res = [[1]]
    for r in 1...num_rows
        row = []
        for i in 0..r
            if i == 0 || i == r
                row << 1
            else
                row << res[r - 1][i - 1] + res[r - 1][i]
            end
        end
        res << row
    end
    return res
end