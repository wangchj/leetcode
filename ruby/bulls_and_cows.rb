require 'set'

# @param {String} secret
# @param {String} guess
# @return {String}
def get_hint(secret, guess)
    secret = secret.chars
    guess  = guess.chars
    bulls = 0
    cows  = 0
    tally = {}

    # First find bulls
    for i in 0...secret.length
        if secret[i] == guess[i]
            bulls += 1
            guess[i] = nil
        else
            digit = secret[i]
            if tally.has_key?(digit)
                tally[digit] = tally[digit] + 1
            else
                tally[digit] = 1
            end
        end
    end
    
    # Find cows
    guess.each do |digit|
        if digit != nil && tally.has_key?(digit)
            cows += 1
            if tally[digit] > 1
                tally[digit] = tally[digit] - 1
            else
                tally.delete(digit)
            end
        end
    end
    
    return "#{bulls}A#{cows}B"
end
