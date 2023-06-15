require 'debug'

def max_profit1(prices)
    maxProffit = 0
    l = 0
    while l < prices.length
        r = l + 1
        while r < prices.length && prices[l] < prices[r]
            maxProffit = [maxProffit, prices[r] - prices[l]].max
            r += 1
        end
        l += 1
    end
    
    return maxProffit
end

def max_profit2(prices)
    l, r, maxProf = 0, 1, 0
    debugger
    while r < prices.length
        if prices[l] < prices[r]
            maxProf = [maxProf, prices[r] - prices[l]].max
        else
            l = r
        end
        r += 1
    end
    maxProf
end

puts max_profit2([7,1,5,3,6,4])