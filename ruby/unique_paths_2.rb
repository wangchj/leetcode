# @param {Integer[][]} obstacle_grid
# @return {Integer}
def unique_paths_with_obstacles(obstacle_grid)
    m = obstacle_grid.length
    n = obstacle_grid[0].length
    a = Array.new(m) {Array.new(n)}
    for i in 0...m
        for j in 0...n
            if obstacle_grid[i][j] == 1
                a[i][j] = 0
            elsif i == 0 && j == 0
                a[i][j] = (obstacle_grid[i][j] == 1 ? 0 : 1)
            else
                from_top  = (i == 0 ? 0 : a[i - 1][j])
                from_left = (j == 0 ? 0 : a[i][j - 1])
                a[i][j] = from_top + from_left
            end
        end
    end
    return a[m - 1][n - 1]
end
