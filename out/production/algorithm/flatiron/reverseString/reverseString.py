
def reverse_string1(string) :
    i = len(string) - 1
    new_string = ""
    while i >= 0 :
        new_string += string[i]
        i -= 1
    return new_string
print(reverse_string1("paolo"))

def reverse_string2(string):
    newString = ""
    for i in range(len(string) -1, -1, -1):
        newString += string[i]
    return newString
print(reverse_string2("paolo"))