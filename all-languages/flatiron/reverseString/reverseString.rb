def reverse_string1(str)
    newString = ""
    for i in (0..str.length-1).reverse_each
        newString += str[i]
    end
    newString
end
puts reverse_string1("paolo")


def reverse_string2(string)
    i = string.length - 1
    newString = ""
    while i >= 0
        newString += string[i]
        i -= 1
    end
    newString
end
puts reverse_string2("paolo")

