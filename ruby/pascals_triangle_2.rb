# @param {Integer} row_index
# @return {Integer[]}
def get_row(row_index)
    p = [[1]]
    for r in 1..row_index
        row = []
        for i in 0..r
            if i == 0 || i == r
                row << 1
            else
                row << p[r - 1][i - 1] + p[r - 1][i]
            end
        end
        p << row
    end
    return p[row_index]
end
