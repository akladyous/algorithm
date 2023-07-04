def reverseNum(x)
    flag = false
    result = 0
    if x.negative?
        x = - x
        flag = true
    end
    
    while x.positive?
        digit = x % 10
        x = x / 10
        result = (result * 10) + digit
    end
    return 0 if result >= 2.pow(31) -1 || result <= -2.pow(31)
    flag ? - result : result
end
puts reverseNum -12345