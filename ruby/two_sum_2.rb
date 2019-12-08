# @param {Integer[]} numbers
# @param {Integer} target
# @return {Integer[]}
def two_sum(numbers, target)
    map = {}
    for i in 0...numbers.length
        element = numbers[i]
        complement = target - element
        return [map[complement] + 1, i + 1] if map[complement]
        map[element] = i
    end
end
