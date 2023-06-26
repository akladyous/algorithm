import math


def findFactorPairs(num):
    factorPairs = []
    sqrtNum = int(math.sqrt(num))  # Calculate the square root of the number

    for i in range(1, sqrtNum + 1):
        if num % i == 0:
            factorPairs.append((i, num // i))  # Add the factor pair (i, num // i)

    return factorPairs


# Example usage:
print(findFactorPairs(32))
print(findFactorPairs(16))
print(findFactorPairs(8))
